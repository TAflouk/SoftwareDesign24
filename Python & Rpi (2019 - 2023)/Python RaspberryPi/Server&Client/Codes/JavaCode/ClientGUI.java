package clientserver;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.*;

/*
 * Creates GUI to display readings received from the server.
 */
@SuppressWarnings("serial")
public class ClientGUI  extends JFrame implements ActionListener{

	//Create Panel to add to the JFrame.
	private static JPanel panel = new JPanel();
	//Create components to add to Panel
	private JLabel tempLabel = new JLabel("Temperature Readings");		private JLabel humLabel = new JLabel("Humidity Readings");
	private JButton minTemp = new JButton("get min temp");				private JButton minHum = new JButton("get min Hum");
	private JButton avgTemp = new JButton("get avg temp");				private JButton avgHum = new JButton("get avg Hum");
	private JButton maxTemp = new JButton("get max temp");				private JButton maxHum = new JButton("get max Hum");
	private JButton tempList = new JButton("full temp list");			private JButton humList = new JButton("full Hum list");
	
	private JTextField minTempField = new JTextField();					private JTextField minHumField = new JTextField();
	private JTextField avgTempField = new JTextField();					private JTextField avgHumField = new JTextField();
	private JTextField maxTempField = new JTextField();					private JTextField maxHumField = new JTextField();
	private JTextField fullTempField = new JTextField();				private JTextField fullHumField = new JTextField();
	
	private JButton exit = new JButton("exit");
	
	//Constructor to build the GUI.
	public ClientGUI() {
		super();// call to super constructor in JFrame class.
		JFrame fr = new JFrame("Sensor readings");//set up JFrame with title.
		
		fr.setResizable(false);
		panel.setLayout(null);
		fr.setSize(340, 430);
		fr.setLocation(650, 200);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		panel.setSize(350, 200);
		
		// Set the size and location of the components in the Panel.
		tempLabel.setBounds(100, 0, 160, 30);				
		minTemp.setBounds(20, 30, 120, 25);			minTempField.setBounds(150, 30, 160, 25);
		avgTemp.setBounds(20, 60, 120, 25);			avgTempField.setBounds(150, 60, 160, 25);
		maxTemp.setBounds(20, 90, 120, 25);			maxTempField.setBounds(150, 90, 160, 25);
		tempList.setBounds(20, 120, 120, 25);		fullTempField.setBounds(150, 120, 160, 25);
		
		humLabel.setBounds(110, 180, 160, 30);
		minHum.setBounds(20, 210, 120, 25);			minHumField.setBounds(150, 210, 160, 25);
		avgHum.setBounds(20,240, 120, 25);			avgHumField.setBounds(150, 240, 160, 25);
		maxHum.setBounds(20, 270, 120, 25);			maxHumField.setBounds(150, 270, 160, 25);
		humList.setBounds(20, 300, 120, 25);		fullHumField.setBounds(150, 300, 160, 25);
		
		exit.setBounds(110, 360, 120, 25);
		
		//Add the components to the Panel.
		panel.add(tempLabel);										panel.add(humLabel);		
		panel.add(minTemp);			panel.add(minTempField);		panel.add(minHum);			panel.add(minHumField);
		panel.add(avgTemp);			panel.add(avgTempField);		panel.add(avgHum);			panel.add(avgHumField);
		panel.add(maxTemp);			panel.add(maxTempField);		panel.add(maxHum);			panel.add(maxHumField);
		panel.add(tempList);		panel.add(fullTempField);		panel.add(humList);			panel.add(fullHumField);
		panel.add(exit);
		
		//Add the Panel to the JFrame.
		fr.getContentPane().add(panel);
		
		//Add ActionListener to buttons
		minTemp.addActionListener(this);			minHum.addActionListener(this);
		avgTemp.addActionListener(this);			avgHum.addActionListener(this);
		maxTemp.addActionListener(this);			maxHum.addActionListener(this);
		tempList.addActionListener(this);			humList.addActionListener(this);
		
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object target = e.getSource();
		
		if(target == exit) {
			System.exit(0);	
		}
		
		if(target == minTemp) {
			panel.setBackground(Color.cyan);
			try {
				String data = getValueFromServer(panel,"1");
				minTempField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(target == avgTemp) {
			panel.setBackground(Color.green);
			try {
				String data = getValueFromServer(panel,"2");
				avgTempField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(target == maxTemp) {
			panel.setBackground(Color.red);
			try {
				String data = getValueFromServer(panel,"3");
				maxTempField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(target == tempList) {
			try {
				String value = getValueFromServer(panel,"4");
				fullTempField.setText(value);
				System.out.println(value);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}
		if(target == minHum) {
			panel.setBackground(Color.cyan);
			try {
				String data = getValueFromServer(panel,"5");
				minHumField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				System.out.println("IO Exception");
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				System.out.println("Interrupted Exception");
				e1.printStackTrace();
			}
		}
		if(target == avgHum) {
			panel.setBackground(Color.green);
			try {
				String data = getValueFromServer(panel,"6");
				avgHumField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				System.out.println("IO Exception");
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				System.out.println("Interrupted Exception");
				e1.printStackTrace();
			}
		}
		if(target == maxHum) {
			panel.setBackground(Color.red);
			try {
				String data = getValueFromServer(panel,"7");
				maxHumField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				System.out.println("IO Exception");
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				System.out.println("Interrupted Exception");
				e1.printStackTrace();
			}
		}
		if(target == humList) {
			try {
				String data = getValueFromServer(panel,"8");
				fullHumField.setText(data);
				System.out.println(data);
			} catch (IOException e1) {
				System.out.println("IO Exception");
				e1.printStackTrace();
			} catch (InterruptedException e1) {
				System.out.println("Interrupted Exception");
				e1.printStackTrace();
			}
		}
		
	}
	
	public static String getValueFromServer(JPanel panel,String menu) throws IOException, InterruptedException  {
		//set up address of server
		InetAddress inet = InetAddress.getByName("192.168.178.45");
		//create socket using server ip address and port....
		Socket s = new Socket(inet, 2003);
        // send the menu value to the server
	    DataOutputStream writeToServer = new DataOutputStream(s.getOutputStream());
	    writeToServer.writeBytes(menu);
        
		//wait patiently....
		Thread.sleep(200);
		//input from the socket (s)
		InputStream in = s.getInputStream();
		//String value = in.toString();
        BufferedReader inputLine = new BufferedReader(
        new InputStreamReader(s.getInputStream()));
		
        //create array that splits on the space. What is returned sets the length of the array.
		//String[] data = inputLine.readLine().split(" ");
		//print entire line
		//System.out.println(data.length);	
        String result = inputLine.readLine();
        System.out.println(result);
		s.close();
		return result;
	}
	public static void main(String[] args) {
		
		new ClientGUI();
		
	}
}

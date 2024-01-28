package clientserver;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GetServerInfo  implements ActionListener{
	
	JFrame window = new JFrame("Event listener");
	
	
	JPanel panel = new JPanel();
	JButton buttonAverage = new JButton("Get Average Temp");
	JButton buttonMax = new JButton("Get Maximum Temp");
	JButton buttonMin = new JButton("Get Minimum Temp");
	JLabel label = new JLabel("No button Pressed");

	
	public GetServerInfo(){

		buttonAverage.setPreferredSize(new Dimension(300,100));
		buttonMin.setPreferredSize(new Dimension(300,100));
		buttonMax.setPreferredSize(new Dimension(300,100));
		label.setPreferredSize(new Dimension(200,100));

		buttonAverage.addActionListener(this);
		buttonMin.addActionListener(this);
		buttonMax.addActionListener(this);

		panel.add(buttonAverage);
		panel.add(buttonMin);
		panel.add(buttonMax);
		panel.add(label);

		window.getContentPane().add(panel);
		window.setSize(500,700);
		window.pack();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// When button pressed, get value from server according to button pressed
		// "1" means getAverage
		// "2" means getMaximum
		// "3" means getMinimum ... not coded yet
	
		if(e.getSource().equals(buttonAverage)){
			label.setText("Average button was pressed");
			try {
				
				String data = getValueFromServer(panel,"1");
				
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	}
		else if(e.getSource().equals(buttonMax)){
			label.setText("Maximum button was pressed");

			try {
				
				String data = getValueFromServer(panel,"2");
				
				
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		else if(e.getSource().equals(buttonMin)){
			label.setText("Minimum button was pressed");
		}
	}    

	
	public static void main(String[] args)throws Exception, InterruptedException
	{
		
		// Create new GUI frame
		@SuppressWarnings("unused")
		GetServerInfo frame =  new GetServerInfo();
	
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
}


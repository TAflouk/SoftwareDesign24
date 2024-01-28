package OpenClosePORTS;

import java.net.InetAddress;

public class Google {

	public static void main(String[] args) {
		try
		{
			InetAddress[] myHost =  InetAddress.getAllByName("www.google.com");
			int counter = 1;
			for(InetAddress i:  myHost) 
			{
				System.out.println("IPAddress "+ counter + ": "+ i);
				counter++;
			}
			
			for(int i = 0; i <= myHost.length ;i++)
			{
				InetAddress host = myHost[i];
				System.out.println("IPAddress "+ i + ": "+ myHost);
				
			}
		}
		catch(Exception e) 
		{
			System.out.println("Not found ");
		}
	}

}

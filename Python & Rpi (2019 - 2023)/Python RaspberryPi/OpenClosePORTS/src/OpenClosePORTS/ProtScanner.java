package OpenClosePORTS;

import java.net.InetSocketAddress;
import java.net.Socket;

public class ProtScanner 
{

	public static void main(String args[])
	{
//		for(int port = 1; port <= 1000; port++) 
//		{
		int port = 9876;
			try 
			{
				//System.out.println("Starting...");
				Socket soc = new Socket();
				soc.connect(new InetSocketAddress("localhost", port));
				soc.close();
				System.out.println("port "+ port +" is open");

			}
			catch(Exception e) 
			{
				//System.out.println("port "+ port +" is closed");
			}
		}
	//}
}

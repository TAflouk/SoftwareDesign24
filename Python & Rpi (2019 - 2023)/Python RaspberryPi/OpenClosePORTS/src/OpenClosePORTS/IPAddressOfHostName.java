package OpenClosePORTS;

import java.net.InetAddress;
import java.util.Scanner;

public class IPAddressOfHostName {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter a domain name: ");
		String hostName = sc.next();
		//String hostName = "www.rte.ie";
		try
		{
		InetAddress ip =  InetAddress.getByName(hostName);
		System.out.println("The ip address for host" +hostName+ " is "+ ip.getHostAddress());
		}
		catch(Exception ex)
		{
			System.out.println("gost is not found ");
		}
	}
}

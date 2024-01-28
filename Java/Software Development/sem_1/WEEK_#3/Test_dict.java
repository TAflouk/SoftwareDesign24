import java.util.*;

public class Test_dict
{
	public static void main(String[] args)
	{
		Dictionary edu = new Hashtable();
		edu.put("12","hello");
		edu.put("2","bey");
		for (Enumeration i = edu.elements(); i.hasMoreElements();)
		{
			System.out.print("Values in Dict: " + i.nextElement());
			}
		//System.out.println("sdasdasad");
	}
}
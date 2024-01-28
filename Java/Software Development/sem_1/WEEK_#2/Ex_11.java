/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.Scanner;


// --- CLASSES ---
public class Ex_11
{
	public static void main(String [] args)
	{
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter the Drive: ");
			String f_Name = in.nextLine();
			String file_Place = f_Name + ":\\Windows\\System\\Readme.txt";
			System.out.print(file_Place);
		}
}
/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.Scanner;


// --- CLASSES ---
public class Ex_10
{
	public static void main(String [] args)
	{
			Scanner in  = new Scanner(System.in);
			System.out.println("Enter the lenght: ");
			int lenght = in.nextInt();
			System.out.println("Enter the width: ");
			int width = in.nextInt();
			// Calculation
			double perimeter  = width * lenght;
			double area  = Math.pow(width * lenght,2);
			// display the result
			System.out.println("the perimeter: " + perimeter);
			System.out.println(" the area: " + area);
			//double diagonal = Math.sqrt();

			double diagonal = Math.pow(width,2) + Math.pow(lenght,2);
			double total = Math.sqrt(diagonal);
			System.out.println("the diagonal: " + total);
	}
}
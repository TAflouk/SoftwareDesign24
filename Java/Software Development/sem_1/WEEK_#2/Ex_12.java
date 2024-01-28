/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.Scanner;
import java.lang.Math;

// --- CLASSES ---
public class Ex_12 {
	public static void main(String [] args){
	Scanner in  = new Scanner(System.in);
	System.out.println("Enter the first num: ");
	int num_1 = in.nextInt();
	System.out.println("Enter the Second num: ");
	int num_2 = in.nextInt();
	double avrg = (num_1 + num_2) / 2;
	System.out.printf("Sum: "+ num_1 + num_2);
	System.out.printf("Difference: "+ (num_1 - num_2));
	System.out.printf("Product: " + num_1 * num_2 );
	System.out.printf("Avrg: " + avrg);
	System.out.printf("Distance: " + Math.abs(num_1 - num_2));
	System.out.printf("Maximum: " + Math.max(num_1 , num_2));
	System.out.printf("Minimum: " + Math.min(num_1 , num_2));
	}

}
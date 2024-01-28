/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.*;


// --- CLASSES ---
public class Ex_7 {
	public static void main(String [] args){
	Scanner in  = new Scanner(System.in);
	System.out.println("Enter the first num: ");
	int num_1 = in.nextInt();
	System.out.println("Enter the Second num: ");
	int num_2 = in.nextInt();
	double avrg = (num_1 + num_2) / 2;
	System.out.println("Sum: "+ num_1 + num_2);
	System.out.println("Difference: "+ (num_1 - num_2));
	System.out.println("Product: " + num_1 * num_2 );
	System.out.println("Avrg: " + avrg);
	System.out.println("Distance: " + Math.abs(num_1 - num_2));
	System.out.println("Maximum: " + Math.max(num_1 , num_2));
	System.out.println("Minimum: " + Math.min(num_1 , num_2));
	}

}

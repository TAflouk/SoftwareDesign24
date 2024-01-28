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
public class Ex_9 {
	public static void main(String [] args){
	Scanner in  = new Scanner(System.in);
	System.out.println("Enter the radius: ");
	int radius = in.nextInt();

	double  circumference = 2 * Math.PI * radius;

	double area = 2 * Math.PI * Math.pow(radius, 2);
	double volume = (4/3) * Math.PI * Math.pow(radius, 2);
	System.out.println("The circ... :" +  circumference + "Cm");
	System.out.println("The Area :" + area + "Cm");
	System.out.println("The Area :" + volume + "Cm");
	}
}
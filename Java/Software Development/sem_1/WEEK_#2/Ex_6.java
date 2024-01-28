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
public class Ex_6 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first num: ");
		int num_1 = in.nextInt();
		System.out.println("Enter the second num: ");
		int num_2  = in.nextInt();
		System.out.println("The Max num is : " +Math.max(num_1, num_2));
		}

}
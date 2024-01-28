/*
* Author: TAflouk
* Date:2021-##-## --:--:--
* LastModifiedBy:TAflouk
* Last Modified time:2021-##-## --:--:--
*/

// --- IMPORTS ---
import java.util.Scanner;

// --- CLASSES ---
public class Ex_3{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the first num: ");
        int num_1 = in.nextInt();
        System.out.print("Please Enter the second num: ");
        int num_2 = in.nextInt();
        System.out.println("the product of the numbers is: "+(num_1*num_2));
    }
}

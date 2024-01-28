// --- IMPORTS ---
import java.util.Scanner;
import java.lang.Math;

public class Distance {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num = in.nextInt();
        System.out.print("Enter second num:");
        int num2 = in.nextInt();

        System.out.println("The Distance between the first num and the Second num is: "+ Math.abs(num - num2));
    }
}

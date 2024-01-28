
// --- IMPORTS ---
import java.lang.Math;
import java.util.Scanner;

// ---CLASSES
public class Max_num
{
	public static void main (String [] arg)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first num: ");
		int num = in.nextInt();
		System.out.print("Enter the second num: ");
		int num2 = in.nextInt();
		System.out.println("the max value between the two nums is: " + Math.max(num,num2));

	}
}
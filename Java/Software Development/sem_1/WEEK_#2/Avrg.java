import java.util.Scanner;
public class Avrg
	{  public static void main(String [] arg)
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first num: ");
        int num = in.nextInt();
        System.out.print("Enter second num:");
        int num2 = in.nextInt();
        System.out.println("The Avrg for the two nums is: "+ (num + num2)/2.0);
    }
}


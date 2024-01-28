import java.util.Scanner;
/*
Write a program that reads an integer and prints how many digits the number has, by
checking whether the number is < 10, < 100, and so on. (Assume that all integers are
less than ten billion.) If the number is negative, first multiply it with –1.
*/
public class exTwo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num: ");
		double num = in.nextDouble();
		if (num <= 0)
		{
			System.out.println(num*-1);
			}
		else if (num <= 10)
		{
			System.out.println("00");
			}
		else if (num >= 100)
		{
			System.out.println("000");
		}
		else if (num >= 1000)
		{
			System.out.println("0000");
		}
		else if (num >= 1000000)
		{
			System.out.println("000000");
		}
	}


}
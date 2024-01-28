import java.util.Scanner;

/*
Write a program that reads a floating-point number and prints “zero” if the number is zero. Otherwise,
print “positive” or “negative”. Add “small” if the absolute value of the number is less than 1, or “large” if it
exceeds 1,000,000.
*/
public class week5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num: ");
		double num = in.nextDouble();
		if (num == 0)
		{
			System.out.println("Zero");

			}
		else if (num < 1 || num < 0)
		{
			System.out.println("the num is small "+ Math.abs(num));
			}

		else if (num > 0 || num <=  1000000)
		{
			System.out.println("the num is positive "+ Math.abs(num));
			}
		}

}
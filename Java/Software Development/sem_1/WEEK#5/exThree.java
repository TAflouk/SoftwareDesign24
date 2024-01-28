import java.util.Scanner;
/*
Write a program that reads three numbers and prints “all the same” if they are all the
same, “all different” if they are all different, and “neither” otherwise.
*/
public class exThree
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num: ");
		double numOne = in.nextDouble();
		double numTwo = in.nextDouble();
		double numThree = in.nextDouble();
		if (numOne == numTwo && numTwo == numThree)
		{
			System.out.println("all the same!!!");
			}
		System.out.println("not the same");
		}
	}
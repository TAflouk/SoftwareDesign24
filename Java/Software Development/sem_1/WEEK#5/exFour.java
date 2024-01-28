import java.util.Scanner;
/*
Write a program that reads three numbers and prints “increasing” if they are in increasing order,
“decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means “strictly
increasing”, with each value larger than its predecessor. The sequence 3 4 4 would not be considered
increasing.
*/
public class exFour
{
	public static void main(String[] args)
	{
		int nums[] = {123,23122,323,4,5,6,7,8,9,8,89898};

		//Scanner in = new Scanner(System.in);
		//System.out.println("Enter a num: ");
		//double numOne = in.nextDouble();
		//nums.append(numOne);


		for (int i = nums.length; i >= 0; i--)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a num: ");
			double numOne = in.nextDouble();
			System.out.println(i);
		}

		}
	}
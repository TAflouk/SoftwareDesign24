//import java.util.Math;
import static java.lang.Math.*;
import java.util.Scanner;
public class ex_week_6
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		ex_8();
		//System.out.println(ex_7(32677));
		}
	public static int evenNumber(int num)
	{
		int total = 0;
		for(int i =1; i<=num; i++)
		{
			if (i %2 == 0)
			{
				total += i;
				}
				}
			return total;
		}

	public static int square(int num)
	{
		int total = 0;
		for(int i =1;i<=num;i++)
		{
			total += i*2;
			}
			return total;
		}
	public static int powerNum(int num)
	{
		int total = 0;
		for(int i = 2; i<=num;i++)
		{
			total += Math.pow(i,2);
			}
			return total;
		}
	public static int odd(int a, int b)
	{
		int total = 0;
		while(a<=b)
		{
			if (a %3 == 0)
			{
				total += a;
				}
			a++;
			}
			return total;
		}

	public static int oddDigits(int value)
	{
		int total = 0;
		while(value>0)
		{
			int num = value %10;
			if (num %2==1)
			{
				total +=num;
			}
				value /= 10;
			}
			return total;
		}

	public static void ex_8(String[] args)
	{
		System.out.println("Enter The value: ");
		int value = in.nextInt();
		int maximum = value;
		int minimum = value;
		while(in.hasNextInt())
		{
			value = in.nextInt();
			if(value > maximum)
			{
				maximum = value;
				}
			else if (value < minimum)
			{
				minimum = value;
				}
			}
		System.out.println("max = "+ maximum);
		System.out.println("min = "+ minimum);
		}
}
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class week_6
{
	public static void main(String[] args)
	{
		ex_5(50,10,-50);

		}
	public static int factorial(int num)
	{
		int total = 1;
		while (num > 0)
		{
			total = total * num;
			num --;
			}
		return total;
		}
	public static void print_num(int num)
	{
		while(num <= 10)
		{
			System.out.print(num + " ");
			num ++;
			}
		System.out.println(" ");
		}
	public static void print_sqr(int num)
	{
		while(num <= 10)
		{
			System.out.print(num * 2 + " " );
			num ++;
			}
		System.out.println(" ");
		}


	public static void decreasing(int counter ){

			while(counter >= -15)
			{
			System.out.println(counter);
			counter -=3 ;
			if (counter == -3)
			{
				System.out.println(counter);
				}
			}
		}
	public static void count_down(int counter )
	{
		while(counter>=0 )
		{
			System.out.println(counter);
			counter --;
			}
	}
	public static void ex_5(int counter, int num ,int breakNum )
	{
		while (counter >= breakNum)
		{
			System.out.println(counter);
			counter -= num;
			}
		}



}
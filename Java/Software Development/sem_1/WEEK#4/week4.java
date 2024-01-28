import java.util.*;



public class week4
{
	public static void main(String[] args)
	{
		System.out.println(Ex7("heysdsa","hel"));

		}

	public static String Ex1(int num)
	{
		if (num == 0)
		{
			return "the number is zero not negative and not pos";
			}
		if (num < 0)
		{
			return num + " is negative";
			}

		return num +" is positive";
	}

	public static String Ex2(int num)
	{
		if (num%5 == 0)
		{
			return num + " is divisible by 5";
			}
		return num + " is not divisible by 5";
	}

	public static String Ex3(int num)
	{
		if (num%2 == 0)
		{
			return num + " is Even" ;
			}
		return num + " is Odd";
	}

	public static String Ex4(String newStr)
	{
		if (newStr.length()>= 4)
		{
			return newStr + " is a big word";
		}

		return newStr + " is small word";
		}
		public static String Ex5(int num_1, int num_2)
		{

			if (num_1 < num_2)
			{
				return num_1 + " is less than " + num_2;
				}
			if (num_1 > num_2)
			{
				return num_2 + " is grater than " + num_1;
				}
			return num_1 + " is equal to " + num_2;
			//return num_1 + " is less than " + num_2;
			//return num_2 + " is grater than " + num_1;
		}

		public static String Ex6(int num1, int num2, int num3)
		{
			if (num1>= num2 && num2 >= num3)
			{
				return num1 + "is greater than " + num2 + " and " + num2 + " is greater than " + num3;
				}
			return "not greater than";
		}

		public static String Ex7(String word_1 , String word_2)
		{
			if (word_1.length() == word_2.length())
			{
				return word_1 + " has the same length " + word_2;
				}
			return word_1 + " not the same length " + word_2;

			}

}
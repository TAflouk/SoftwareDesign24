import java.util.*;


public class Week_3
{

	//Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		//System.out.println(withoutcomma(3));
		//removeComma(3);
		//drawSqrs(4);
		spaces();
		}
	public static String withoutcomma(int num ) // num = 3
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num between 1,000 and d 999,999 : ");
		String nums= in.nextLine();
		//int lenOfSting = nums.length();
		String lastOne = nums.substring(0,nums.length() -num) + "," + nums.substring(nums.length()-num ,nums.length());
		return  lastOne;
		}

	public static void removeComma(int num )
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an integer between 1000 and 999999: ");
		String nums = in.nextLine();
		nums.charAt(4);
		String firstBit = nums.substring(0,nums.length() -num);
		String secBit = nums.substring(nums.length()-num ,nums.length());
		String newStr = nums.replace(",","");
		//String nums.charAt(3)
		System.out.println(newStr);
		//return newString;

		//return newString;
		//for (int i = 0; i <= nums.length(); i++ )
		//{
		//	System.out.println(i);
		//	}
		//String newString = nums.replace(",","");
		//return nums.replace(",","");


		}

	public static void drawSqrs(int num)
	{
		String top = "+--+--+--+";
		String mid = "|  |  |  |";
		for(int i = 0; i<=num-1; i++)
		{
			System.out.println(top);
			System.out.println(mid);

			if (num == num -1)
			{
				System.out.println(top);
				}
			}
	}

	public static void spaces()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a num: ");
		String num = in.nextLine();
		for (int i = 0; i<= num.length()-1 ;i++)
		{
			System.out.print(num[i]);
			}
		//return num;
		}
}
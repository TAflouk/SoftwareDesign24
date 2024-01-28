import java.util.Scanner;
public class Flag
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
	System.out.println(flag_());
	}
	public static int flag_()
	{
	boolean positive = true;
	int total = 0;
	while(positive)
	{
		System.out.println("Enter a Number");
		int value = in.nextInt();
		if (value<0)
		{
			positive = false;
			System.out.println("byeee");

			}
		total += value ;

	}
	return total;
	}
}
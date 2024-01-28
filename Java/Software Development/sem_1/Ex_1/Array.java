import java.util.Scanner;

public class Array
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the size of the arrya: ");
		int size = in.nextInt();
		int numList[] = new int[size];
		for(int i = 0; i< numList.length; i++)

		{
			System.out.println("Enter element No:"+(i+1));
			int num = in.nextInt();
			numList[i] =  num;
			}
			print_num(numList);


		}
		public static void print_num(int[] numList)
		{
			//for(int i = 0; i < numList.length; i++ )
			//{
			//	System.out.println(numList[i]);
			//}

			}

}
import java.util.Scanner;

public class fillArray
{
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter the size of the array: ");
		int size;
		size = input.nextInt();
		int[] num_list_size = new int[size];
		fill_array(num_list_size);
		System.out.println(find_me(num_list_size));
		//print_list(num_list);
		//System.out.print(search_list(num_list,23));

	}
	public static void fill_array(int[] num_list)
	{
		for (int i = 0 ; i < num_list.length; i++)
		{
			System.out.println("Enter No: " + (i+1));
			num_list[i] = input.nextInt();
		}
	}
	public static void print_list(int[] num_list)
	{
		for(int i = 0; i < num_list.length; i++)
		{
			System.out.println(num_list[i]);
		}
	}
	public static String search_list(int[] num_list, int target)
	{
		for (int i = 0; i < num_list.length; i++)
		{
			if (num_list[i] == target)
			{
				return "found @: " + i;
			}


		}
		return "NOt found";
	}
	public static String find_me(int[] num_list)
	{
		System.out.println("Enter the number you wanna find: ");
		int num = input.nextInt();
		for (int i = 0; i <num_list.length; i++)
		{
			if (num_list[i] == num){
				return num_list[i] +"found @ idx:"+i;
			}
		}
		return num + "not found";
	}
}
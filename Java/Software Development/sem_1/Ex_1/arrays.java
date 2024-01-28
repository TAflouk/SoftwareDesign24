public class arrays
{
	public static void main(String[] args)
	{
		int listOfNums[] = {1,2,3,4,5,6,7};
		System.out.println(listOfNums);
		for (int i = 0; i<= listOfNums.length; i++)
		{
			if (i==4)
			{
				System.out.println("number "+ i +" found @ index " + listOfNums[i-2]);
				}
			//System.out.println(listOfNums[i]);
			}
	}
	}
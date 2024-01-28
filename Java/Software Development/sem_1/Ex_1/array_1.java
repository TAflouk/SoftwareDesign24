public class array_1
{
	public static void main(String[] args)
	{
		int[] list = {1,231,2,432,3,23};
		System.out.println(search_for_num(list, 22312));
		}
	public static String search_for_num(int[]list, int target)
	{
		for (int i = 0; i<list.length; i++)
		{
			if(list[i] == target)
			{
				System.out.println();
				return  target + " Found @: " + i ;

				}
			}
		return target +" NOT Found";

		}
}
import java.util.Scanner;

public class ArrayTwoD{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter the Size of the array: ");
        int size = in.nextInt();
        int[] numList = new int[size];
        for (int i = 0; i < size; i++)
        {
            //System.out.printf("Enter No: ","%d", (i+1));
            System.out.println("Enter No"+ (i+1)+":");
            int num = in.nextInt();
            numList[i] = num;
        }
    }
}
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("please enter the first num: ");
        int num1 = in.nextInt();
        System.out.print("please enter the second num: ");
        int num2 = in.nextInt();
        System.out.println("the difference: " +(num1-num2));

    }
}
/**
 * 
 */
package ExamGradeCalculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: TAflouk
 * @Date: 27/02/22
 * @LastModified: --/02/22
 */
public class Main {
	private static Scanner scn;
	public static String generateLineLine(int numOfStars, char symbl)
	{
		String newStr = "";
		for(int i = 0; i <= numOfStars; i++)
		{
			newStr += symbl;
		}
		return newStr;
	}
	/**@Method: to generate a dramatic ==> Loding...
	 * @param (String, String)
	 * @return null
	 */
	public static void generateDramaticDots(String status, String dots) throws InterruptedException
	{
		System.out.print(status);
		for(int i = 0; i<= 6; i++)
		{
			System.out.print(" ");
			System.out.print(dots);
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	public static void generateTitle(String title)
	{
		System.out.println("\n\n");
		System.out.println(generateLineLine(80,'*'));
		System.out.println("\n");
		System.out.print("\t\t\t----- ");
		System.out.print(title);
		System.out.print(" -----");
		System.out.println("\n");
		System.out.println(generateLineLine(80,'*'));
		System.out.println("\n\n\n\n");
	}
	public static void main(String[] args) //throws IOException, MyExceptionHandler
	{	
		scn = new Scanner(System.in);
		String answer ;
		int examMarks, courseworkMarks;
		boolean continueLoop = true;
		generateTitle("GRADE CALCULATOR");
		do
		{
			try 
			{	
				Calculator calculator = new Calculator();
				
				System.out.println("Enter you exam marks between(0 - 75): ");
				examMarks = scn.nextInt();
				calculator.validateExamMarks(examMarks);
				//System.out.println(calculator.getExamMarks());
				System.out.println("\n");
				
				
				System.out.println("Enter you coursework marks between(0 - 25): ");
				courseworkMarks = scn.nextInt();				
				calculator.validateCourseworkMarks(courseworkMarks);
				//System.out.println(calculator.getCourseMark());;
				
				if(calculator.validateCourseworkMarks(calculator.getCourseMark()) &&  calculator.validateExamMarks(calculator.getExamMarks()));
				{
					System.out.println();
					generateDramaticDots("Loding", ".");
					System.out.println();
					char myGrade = calculator.findMyGrade(calculator.getExamMarks(), calculator.getCourseMark());
					System.out.println("Your grade is\n");
					System.out.println("\t" + myGrade);
					System.out.println("\n");
				}
				
				System.out.println("Do you wish to continue(Y/N): ");
				answer = scn.next();
				System.out.println("\n");
				if(answer.equalsIgnoreCase("n"))
				{
					continueLoop = false;
					System.out.println("Good Bye...");
				}
			}
			catch(InputMismatchException e )
			{
				InputMismatchException missMatch =  new InputMismatchException("Please enter positive nunbers ONLY!");
				System.out.println(missMatch.getMessage());
				scn.nextLine();

			}
			catch(MyExceptionHandler e)
			{
				System.out.println(e.getMessage());
				//scn.nextLine();

			}
			catch(Exception e)
			{
				Exception err = new Exception("Sorry enter a number!!!");
				e.getMessage();
				//scn.nextLine();
			}

		}
		while(continueLoop);
		

	}
}

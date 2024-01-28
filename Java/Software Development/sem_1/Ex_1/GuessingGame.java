import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		// Generate a random number between 1 and 100
		int theValue = (int) (Math.random() * 100) + 1;

		final int NO_OF_TRIES = 5;
		boolean guessedCorrectly = false;
		for ( int i = 1; i <= NO_OF_TRIES; i++)
		{
			System.out.println("Please enter guess no. " + i+": ");
			boolean valid = false;
			int input = 0;
			while (!valid)
			{
				System.out.print("Please enter a number between 1 and 100: ");
				input = in.nextInt();
				if (input >=1 && input <= 100)
				{
					valid = true;
				}
				else
				{
					System.out.println("Invalid input. ");
				}
			}
			if (input == theValue)
			{
				System.out.println("You have guessed correctly!!!! You Win!");
				guessedCorrectly = true;
				break;
			}
			else if (input < theValue)
			{
				System.out.println("You guessed too low...");
			}
			else
			{
				System.out.println("You guessed too high...");
			}
		}
		if (!guessedCorrectly)
		{
			System.out.println("The correct answer is: "+theValue);
		}
	}
}
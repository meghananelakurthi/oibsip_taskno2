import java.util.Scanner;
public class numberguess{
	public static void
	guessNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int n = 5;
        int i, guess;
        System.out.println("a number is chosen by system between 1-100");
        System.out.println("guess the number in only in given trails");
        for (i = 0; i < n; i++)
         {
           System.out.println("Guess the number:");
			guess = sc.nextInt();
            if (number == guess) 
            {
				System.out.println("Congratulations!"+ " You guessed the number.");
				break;
			}
			else if (number > guess)
             {
				System.out.println("The number is "+ "greater than " + guess);
			 }
			else if (number < guess)
             {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == n) 
        {
			System.out.println("You have exceeded your"+"n trails.");
            System.out.println("The number was " + number);

		}
	}
public static void main(String args[])
	{
		guessNumberGame();
	}
}

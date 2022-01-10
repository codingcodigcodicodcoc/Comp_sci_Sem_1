import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int hush = rand.nextInt(1000+1);
		while(true)
		{
		System.out.println("Guess the number from 1 - 1000, I'd say the odds are 1 in 1000.");
		int guess = sc.nextInt();
				if (guess == hush)
					{
						System.out.println("You got it right!");
						break;
					}
					else
						System.out.println("Nope. Guess again.");
					
		}
}
}

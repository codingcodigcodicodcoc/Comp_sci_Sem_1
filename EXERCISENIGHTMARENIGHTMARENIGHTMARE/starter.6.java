import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int initial = 100;
		while(initial > 0)
		{
			System.out.println("Wager now? Yes, yes, ,y or NO, no, n");
			String choice = sc.nextLine();
				if (choice.equals("Yes") || choice.equals("yes") || choice.equals("y"))
				{
					System.out.println("You have "+initial+"");
					System.out.println("How much would you like to wager?");
					int bet = sc.nextInt();
					sc.nextLine();
					while (bet <= initial)
						{
						initial = initial - bet;
						Random ran1 = new Random();
						Random ran2 = new Random();
						Random ran3 = new Random();
						int randy = 1 + ran1.nextInt(10);
						int randall = 1 + ran2.nextInt(10);
						int ranch = 1 + ran3.nextInt(10);	
						System.out.println("| "+randy+" | "+randall+" | "+ranch+" |");
							if (randy == randall && randall == ranch && randy == ranch)
							{
								initial = (bet * 3)+ initial;
								System.out.println("You now have "+initial+"!!!!");
								break;
							}
							else if ((randy == randall && ranch !=randall) || (randy == ranch && randall != randy) || (randall == ranch && randy != ranch))
							{
								initial = (bet * 2)+ initial;
								System.out.println("You now have "+initial+"!!!!");
								break;
							}
							else 
							{
								System.out.println("You have "+initial+" what a fucking fish");
								break;
							}
						
						}
				}
				else if (choice.equals("No") || choice.equals("no") || choice.equals("n"))
				{
					System.out.println("pussy");
					System.out.println("You ended with "+initial+"");
					return;
				}
				else
				{
					System.out.println("Read the fucking question");
				}
		}
		if(initial <= 0)
		{
			System.out.println("HAHHHAAAHAAAA IMAGINE LOSING ALL OF YOUR MONEY WHAT A LIL'BITCH HAHAHAHAHAHAH HOLY SHIT YOU ARE SO BAD AT THIS");
			return;
		}
	}
}
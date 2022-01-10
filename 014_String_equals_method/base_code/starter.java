import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
	String choice = sc.nextLine();
	if(choice.equals("Wizard"))
	{
		System.out.println ("Wizards are stupid");
	}
	else if (choice.equals("wizard"))
	{
		System.out.println ("Wizards are stupid");
	}
	else if (choice.equals("Warrior"))
	{
		System.out.println ("Warriors are stupid");
	}
	else if (choice.equals("warrior"))
	{ 
		System.out.println ("Warriors are stupid");
	}
	else if (choice.equals("Rogue"))
	{
		System.out.println ("Rogues are stupid");
	}
	else if (choice.equals("rogue"))
	{
		System.out.println ("Rogues are stupid");
	}
	else
	{
		System.out.println("You're stupid, read the question you illiterate dumb fuck");
	}
	}
}

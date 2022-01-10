import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pick a class, Warrior, Wizard, or Rogue.");
		String role = sc.nextLine();
		myCharacter bob = new myCharacter(role);
		System.out.println("How stronk?");
		int Strongth = sc.nextInt();
		System.out.println("How constitution?");
		int whig = sc.nextInt();
		System.out.println("How charismamamamama?");
		int hotness = sc.nextInt();
		System.out.println("How smort?");
		int breyn = sc.nextInt();
		System.out.println("How dexterity?");
		int dexx = sc.nextInt();
		bob.setAll(role,5,4,2,5,1);
		bob.myToString();
		bob.levelUp();
		
	}
}

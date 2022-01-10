import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Pick a class, Warrior, Wizard, or Rogue.");
		String role = sc.nextLine();
		myCharacter bob = new myCharacter(role);
		bob.myToString();
	}
}

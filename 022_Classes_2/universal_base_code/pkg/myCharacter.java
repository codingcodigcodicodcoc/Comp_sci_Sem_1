import java.util.Scanner;
import java.util.Random;

class character 
{
String role = new String ("Wizard");
int strength = 4;
int dexterity = 9;
int charisma = 8;
int constitution = 7;
int intelligence = 0;
}

class myCharacter {
	public static void myCharacter(String args[]) {
		character Bitch = new character();
		System.out.println("YOu ARE A "+Bitch.role+"!");
		System.out.println("You have "+Bitch.strength+" points in strength");
		System.out.println("You have "+Bitch.dexterity+" points in dexterity");
		System.out.println("You have "+Bitch.charisma+" points in charisma");
		System.out.println("You have "+Bitch.constitution+" points in constitution");
		System.out.println("You have "+Bitch.intelligence+" points in intelligence");
	}
}

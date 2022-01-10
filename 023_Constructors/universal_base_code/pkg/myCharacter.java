package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String wonk = new String("Wizards are kinda really dumb");
	public String wark = new String("Warriors are kinda really dumb.");
	public String ronk = new String("Rogues are kinda really dumb.");
	public String role;
		
	public myCharacter(String choice){
		role = choice;
		if (choice.equals ("Wizard") || choice.equals ("wizard")){
			System.out.println(wonk);
		}
		else if (choice.equals ("Warrior") || choice.equals ("warrior")){
			System.out.println(wark);
		}
		else if (choice.equals ("Rogue") || choice.equals ("rogue")){
			System.out.println(ronk);
		}
		else{
			role = "no role";
			System.out.println("ya stupid");
		}
	}
	public myCharacter(){
		role = "no role";
	}
}
		


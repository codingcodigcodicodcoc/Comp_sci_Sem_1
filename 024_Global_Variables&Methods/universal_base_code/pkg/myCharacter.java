package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	public String wonk = new String("Wizards are kinda really dumb");
	public String wark = new String("Warriors are kinda really dumb.");
	public String ronk = new String("Rogues are kinda really dumb.");
	public String role;
	public String pose;
	public int dexter = 0;
	public int People = 0;
	public int charisma = 0;
	public int stronk = 0;
	public int TFTwo = 0;
		
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
		pose = ("You are a "+role+"");
	}
	public myCharacter(){
		role = "no role";
	}
	public void myToString(){
		System.out.println(pose);
		System.out.println("Strength:"+stronk+"\nDexterity:"+dexter+"\nIntelligence:"+TFTwo+"\nCharisma:"+charisma+"\nCnstitution:"+People+"");
	}
		
}	


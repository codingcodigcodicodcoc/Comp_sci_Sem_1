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
		
	public String setRole(String r){
		role = r;
		if (role.equals("Wizard") || role.equals("wizard")){
			role = wonk;
			System.out.println(wonk);
		}
		else if (role.equals("Warrior") || role.equals("warrior")){
			role = wark;		
			System.out.println(wark);
		}
		else if (role.equals("Rogue") || role.equals("rogue")){
			role = ronk;
			System.out.println(ronk);
		}
		else{
			role = "no role";
			System.out.println("ya stupid");
		}
		pose = ("You are a "+role+"");
		return role;
	}
	public int setStrength(int S)
	{
		stronk = S;
		return stronk;
	}
	public int setcharisma(int C)
	{
		charisma = C;
		return charisma;
	}
	public int setdexterity(int D)
	{
		dexter = D;
		return dexter;
	}public int setintelligence(int T)
	{
		TFTwo = T;
		return TFTwo;
	}
	public int setconstitution(int P)
	{
		People = P;
		return People;
	}
	public boolean setAll(String r, int S, int D, int P, int C, int T)
	{
		setRole(r);
		stronk = S;
		dexter = D;
		People = P;
		charisma = C;
		TFTwo = T;
		if(role.equals("no role"))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	
	}
	
	public myCharacter(){
		role = "no role";
	}
	
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
	public void myToString(){
		System.out.println(pose);
		System.out.println("Strength:"+stronk+"\nDexterity:"+dexter+"\nIntelligence:"+TFTwo+"\nCharisma:"+charisma+"\nCnstitution:"+People+"");
		
	}
	
	
		
}	


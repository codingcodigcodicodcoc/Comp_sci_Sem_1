import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("gib donk naem");
	String god = sc.nextLine();
	System.out.println("gib donk aeg");
	int teeth = sc.nextInt();
	sc.nextLine();
	System.out.println("gib anuda donk naem");
	String doge = sc.nextLine();
	System.out.println("Gib donk breeb");
	String shiba = sc.nextLine();
	stupidfuckingdog jon = new stupidfuckingdog(god);
	jon.setName(god);
	jon.getName();
	stupidfuckingdog snoop = new stupidfuckingdog(god,teeth);
	snoop.setAge(teeth);
	snoop.getAge();
	if (jon.isSleepers())
	{
		System.out.println(god+ " Slumbers");
	}
	else
	{
		System.out.println(god+ " has awaketh");
		jon.bork();
	}
	stupidfuckingdog Odie = new stupidfuckingdog(doge);
	Odie.setName(doge);
	Odie.getName();
	stupidfuckingdog cheems = new stupidfuckingdog(doge,shiba);
	cheems.setBreed(shiba);
	cheems.getBreed();
	if (Odie.isSleepers()){
		if(jon.isSleepers()){
			System.out.println(doge+ " slumbers");
		}
		else{
			System.out.println(doge+ " HAS BEEN AWOKEN FROM HIS SLUMBER BY THE OTHER DOG");
			Odie.bork();
		}
	}
	else{
		System.out.println(doge+" is awake");
		Odie.bork();
	}
	if (doge.equals("Shrek") || god.equals("Shrek")){
		System.out.println("SOMEBODY ONCE TOLD ME THE WOOOORLD WAS GONNA ROLL ME I AINT THE SHARPEST TOOL IN THE SHEEEDDDD SHE WAS LOOKING KINDA DUMB WITH HER FINGER AND HER THUMB IN THE SHAPE OF AN L ON HER FOREHEAD BUT THE YEARS START COMING AND THEY DONT STOP COMING FED TO THE RULES AND THEY HIT THE GROUND RUNNING DIDNT MAKE SENSE NOT TO LIVE FOR FUN YOUR BRAIN GETS SMART BUT YOUR BRAIN GETS DUMB...")
	}
	}
}

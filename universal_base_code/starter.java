import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Ascii Human = new Ascii();
		Ascii Dog = new Ascii();
		Ascii Cactus = new Ascii();
		Ascii Other = new Ascii();
		Ascii funny = new Ascii();
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to print? Cactus, human, dog or funny ?");
		String chalupa = sc.nextLine();
		System.out.println("What would you like to name it?");
		String sugar = sc.nextLine();
		System.out.println("How many times would you like to print it?");
		int coffee = sc.nextInt();
		if(chalupa.equals("Human")  || chalupa.equals("human")){
		Human.setType(chalupa);
		Human.setName(sugar);
		Human.setNumber(coffee);
		Human.printArt();
		}
		else if (chalupa.equals("dog") || chalupa.equals("Dog")){
		Dog.setType(chalupa);
		Dog.setName(sugar);
		Dog.setNumber(coffee);
		Dog.printArt();
		}
		else if (chalupa.equals("cactus") || chalupa.equals("Cactus")){
		Cactus.setType(chalupa);
		Cactus.setName(sugar);
		Cactus.setNumber(coffee);
		Cactus.printArt();
		}
		else if (chalupa.equals("other") || chalupa.equals("Other")){
		Other.setType(chalupa);
		Other.setName(sugar);
		Other.setNumber(coffee);
		Other.printArt();
		}
		else if (chalupa.equals("funny") || chalupa.equals("funny")){
		funny.setType(chalupa);
		funny.setName(sugar);
		funny.setNumber(coffee);
		funny.printArt();
		}
		else {
		Human.setType(chalupa);
		Human.setName(sugar);
		Human.setNumber(coffee);
		Human.printArt();
		}
		sc.nextLine();
}
}

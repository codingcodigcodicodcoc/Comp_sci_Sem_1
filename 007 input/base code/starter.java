import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in); 
	System.out.println("What is your first name?");
	String name = sc.nextLine();
	System.out.println("What is your age?");
	int age = sc.nextInt();
	System.out.println("When is your Birthday?"); 
	int BirthDay = sc.nextInt();
	System.out.println("When is your Birth month?");
	int BirthMonth = sc.nextInt();
	System.out.println("When is your birth year");
	int BirthYear = sc.nextInt();
	System.out.println("How much is a buck fifty?");
	double bugfity = sc.nextDouble();
	System.out.println("Hola estoy la impresora, tu cumpleano es "+BirthDay+"/"+BirthMonth+"/"+BirthYear+", tu tienes "+age+" anos, y tu nombre es "+name+" y buck fifty esta "+bugfity+"");
	}
}

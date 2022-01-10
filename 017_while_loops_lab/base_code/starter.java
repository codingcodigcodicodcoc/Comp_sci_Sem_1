import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("What is thine name, jester?");
		String name = sc.nextLine();
		System.out.println ("How many times do you want me to repeat this sad nomenclature?");
		int times = sc.nextInt();
		System.out.println("fine here you go");
		int c = 0;
		while(true)
		{
			System.out.println(name);
			if (c==times)
			{
				break;
			}
		}

		
	}
}

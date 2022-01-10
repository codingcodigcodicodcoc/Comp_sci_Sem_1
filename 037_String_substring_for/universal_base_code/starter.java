import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a word");
		String x = sc.nextLine();
		int c = 0;
		for(c = 0; c < x.length(); c++){
			System.out.println(x.substring(c,c+1));
		}


		
	}
}
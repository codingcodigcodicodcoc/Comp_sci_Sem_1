import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your name");
		String x = sc.nextLine();
		int c;
		c = x.indexOf(" ");
		c++;
		System.out.println(x.substring(c));

		
	}
}

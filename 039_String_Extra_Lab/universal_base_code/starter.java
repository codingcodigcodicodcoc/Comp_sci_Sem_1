import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a phrase");
		String x = sc.nextLine();
		int c = 0;
		int e = 0;
		String p = "";
		String u = "";
		for(c = 0; c < x.length(); c++){
			if(c == x.indexOf((" "), e)){
				e = c;
					u = x.substring(e,c+1);
					System.out.println(u);
				}
			else if(x.indexOf((" "), e) == -1)
			{
			p = x.substring(e)+u;
		}
		}
	}
}

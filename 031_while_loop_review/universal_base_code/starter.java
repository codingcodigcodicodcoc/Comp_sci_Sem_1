import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int x = 0;
		while(x != 100){
			System.out.println(rand.nextInt(101));
			if(x==100){
				break;
			}
			x=x+1;
		}
	}
}

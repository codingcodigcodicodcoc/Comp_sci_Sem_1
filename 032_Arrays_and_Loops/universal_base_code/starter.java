import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int x = 0;
		int[] yes = new int[1001];
		while(x < yes.length){
			yes[x] = rand.nextInt(1001);
			x=x+1;
			}
			x=0;
			while(x != 1001){
			System.out.println(yes[x]);
			x=x+1;	
			}
}
}
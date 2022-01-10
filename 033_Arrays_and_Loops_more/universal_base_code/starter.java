import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int  x = 0;
		int[] yes = new int[100];
		while(x < yes.length){
			yes[x] = rand.nextInt(100) + 1;
			x=x+1;
			}
			x=0;
		int min = 1000;
		int c = 0;
		while(c < yes.length)
		{
			yes[c] = rand.nextInt(100)+ 1;
			System.out.print(yes[c] + " ");
			c = c + 1;
		}	
		c = 0;
		System.out.println();
		while(c < yes.length)
		{
			if(yes[c] < min)
		{
		min = yes[c];
		}
		c = c + 1;
		}
		System.out.println(min);
		
		int max = 0;
		c = 0;
		while(c < yes.length)
		{
			if(yes[c] > max){
			max = yes[c];
			}
		c = c + 1;
		}
		System.out.println(max);
		
		c = 0;
		int avg = 0;
		while(c < yes.length){
			avg = avg + yes[c];
			c = c+1;
		}
		avg = avg/yes.length;
		System.out.println(avg);
}
}

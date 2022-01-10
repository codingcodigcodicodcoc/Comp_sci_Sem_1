import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[]x) {
		int c = 0;
		while(c < x.length){
			System.out.print(" "+x[c]);
			c=c+1;
			}
	}
	public static int getArrayAvg(int[]x){
		int c = 0;
		int avg = 0;
		while(c < x.length){
			avg = avg + x[c];
			c = c+1;
		}
		avg = avg/x.length;
		System.out.println("Average is " +avg);
		return avg;
	}
	public static int getArrayMax(int[]x){
		int max = 0;
		int c = 0;
		while(c < x.length)
		{
			if(x[c] > max){
			max = x[c];
			}
		c = c + 1;
		}
		System.out.println("Max is " +max);
		return max;
	}
	public static int getArrayMin(int[]x){
		int c = 0;
		int min = 1000;
		while(c < x.length)
		{
			if(x[c] < min)
		{
		min = x[c];
		}
		c = c + 1;
		}
		System.out.println("Min is " +min);
		return min;
	}
	public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int v = 0;
		int[] yes = new int[100];
		while(v < yes.length){
			yes[v] = rand.nextInt(100) + 1;
			v=v+1;
			}
		toStringArray(yes);
		System.out.println();
		getArrayAvg(yes);
		getArrayMin(yes);
		getArrayMax(yes);
	}
}
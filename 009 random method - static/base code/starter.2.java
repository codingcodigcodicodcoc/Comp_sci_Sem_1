import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int rand_numb2 = rand.nextInt(9);
	System.out.println(rand_numb2);
	int a = 1;
	int rand_numb3 = rand.nextInt(100);
	System.out.println (a+rand_numb3);
	double m = 2.5;
	double rand_numb4 = rand.nextDouble();
	System.out.println (m+rand_numb4);
	int y = 14;
	double rand_numb5 = rand.nextDouble();
	int rand_numb6 = rand.nextInt(575);
	System.out.println (y+rand_numb6+rand_numb5);
	}
}

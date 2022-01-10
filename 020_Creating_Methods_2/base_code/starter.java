import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int count = 1;
		int x=a;
		while (count < b)
		{
			a=a*x;
			count= count + 1;
		}
		return a;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Base number what");
	int x = sc.nextInt();
	System.out.println("Exponent what");
	int y = sc.nextInt();
	int z = pow(x,y);
	System.out.println(z);
}
	}

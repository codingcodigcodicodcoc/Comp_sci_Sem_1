
import java.util.Scanner;


class starter {
	public static int pie(int a, int b){
	int x = a;
	int y = b;
	int sum = (a*b)%3;
	if (sum == 0)
	{
		System.out.println("cool "+sum+"");
	}
	else
	{
		System.out.println("no "+sum+"");
	}
	return sum;
}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Give me number");
	int x = sc.nextInt();
	System.out.println("Give me number again");
	int y = sc.nextInt();
	pie(x,y);
	
	}
}
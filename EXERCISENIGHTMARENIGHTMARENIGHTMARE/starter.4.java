import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
System.out.println("Give me number");
int uno = sc.nextInt();
System.out.println(uno);
int count = 0;
while(count != 4)
{
	uno = uno + 1;
	System.out.println(uno);
	count = count+1;
}
	}
}
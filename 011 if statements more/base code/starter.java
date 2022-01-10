import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What should x be?");
	int x = sc.nextInt();

	System.out.println("What should y be?");
	int y = sc.nextInt();
	
	boolean Buck = x>y;
	if(Buck)
	{
		System.out.println("X GON GIVE IT TO YA");
	}
	boolean Buck2 = x<y;
	if(Buck2)
	{
		System.out.println("Y YOU GOTTA DO THIS TO ME");
	}
	boolean Buck3 = x==y;
	if(Buck3)
	{
		System.out.println("THEY'RE THE SAME DAMN THING I SAY");
	}
	}
}

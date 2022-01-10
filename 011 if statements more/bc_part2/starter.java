import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What should x be?");
	int x = sc.nextInt();
	System.out.println("What should y be?");
	int y = sc.nextInt();
	System.out.println("What should z be?");
	int z = sc.nextInt();
	
	boolean Terrold;
	if ((x>y) && (x>z))
			{
			System.out.println("X beeg");
			}
	boolean Jerrold;
	if ((y>x) && (y>z))
			{
			System.out.println("Y beeg");
			}
	boolean Ferrold;
	if ((z>y) && (z>x))
			{
			System.out.println("Z beeg");
			}
		boolean Yerrold;
	if ((x<y) && (x<z))
			{
			System.out.println("X smol");
			}
	boolean Kerrold;
	if ((y<x) && (y<z))
			{
			System.out.println("Y smol");
			}
	boolean Derrold;
	if ((z<y) && (z<x))
			{
			System.out.println("Z smol");
			}
	}	
}
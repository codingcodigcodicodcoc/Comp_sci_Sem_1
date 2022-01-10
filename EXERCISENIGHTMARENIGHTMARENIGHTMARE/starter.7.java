import java.util.Scanner;
import java.util.Random;

class starter {
	public static boolean checkPrime(int x){
	int numbah = x;
	int y = numbah - 1;
	while (y > 1){
		if (numbah%y == 0)
		{
			return false;
		}
		y=y-1;
		if (y == 1)
		{
			return true;	
		}
	}
	return true;
}
public static void printPrimes(int x){
	int numbah = x;
	int y = numbah - 1;
	if (checkPrime(numbah)==false){
		System.out.println("This is not a prime number");
	}
	while (y > 2){
		if (checkPrime(numbah) == false){
			y = y-1;
			if(checkPrime(y)== true){
			System.out.println(y+"prime");
			}
		}
		else if(checkPrime(numbah) == true){
			y = y-1;
			if(checkPrime(y)== true){
			System.out.println(y+"prime");
			}
		}
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gib me numbah");
		int numbah = sc.nextInt();
		printPrimes(numbah);
	}
}

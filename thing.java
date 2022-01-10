import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
        File text = new File("./test.txt");			
        Scanner sc = new Scanner(text);
        String line = sc.nextLine();
        int x = 0;
        int lineNumber = 1;
		String[] yes = new String[370103];
		while(x < yes.length){
			yes[x] = line.nextLine();
			x=x+1;
			}
			Random rand = new Random();
			yes[x]= rand.nextInt(370103);
    }
}		
import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;


class starter {
	public static void main(String args[]) throws FileNotFoundException {
        File text = new File("./test.txt");			
        Scanner sc = new Scanner(text);
        int lineNumber = 1;
        int c = 0;
        int p = 0;
        int r = 0;
        int w = 1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            for(c = 0; c<line.length(); c++){
                String letter = line.substring(c,c+1);
            			if(c % 2 == 0){
            			letter = letter.toLowerCase();
            			}
            			else {
            			letter = letter.toUpperCase();
            			}
            			System.out.print(letter);
                        lineNumber++;
            }
            System.out.println(" ");
        }      
	}
}
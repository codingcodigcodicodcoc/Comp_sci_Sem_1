import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int pok = 0;
		int[] peeps;
		peeps = new int[10];
		peeps[0]=9;
		peeps[1]=8;
		peeps[2]=7;
		peeps[3]=6;
		peeps[4]=5;
		peeps[5]=4;
		peeps[6]=3;
		peeps[7]=2;
		peeps[8]=1;
		peeps[9]=0;
		while(true){
			System.out.println(peeps[pok]);
			if (pok == 9)
			{
				break;
			}
			pok=pok+1;
		}
	}
}

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Hangman{
	private String guessingWord;
	private int numTries;
			int word = 0;
			int x = 0;
			int y = 1;
			int[] wordarray;
			while (word <= guessingWord.length){
				wordarray[word] = guessingWord.substring(x,y);
				word++;
				x++;
				y++;
		}	
		public Hangman(){
			String defo = "potato";
			String guesses = 5;
		}
		public int Hangman(int x){
			String defo = "potato";
			String guesses = x;
		}
		public int guessCheck(String letter, int start){
			for(int word = 0; word < wordarray.length; word++){
				if(letter.equalswordarray[word]){
					System.out.println(letter+ "is letter" +word+);
					return word;
				}
				else{
					return -1;
				}
			}
		}
		public boolean checkWin(boolean [] arr){
			for(int word = 0; word < wordarray.length; word++){
				if(letter.equalswordarray[word]){
		}




		
}

import java.util.Scanner;
import java.util.Random;

class thing{
public static void main(String[] args){
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int v = 0;
		int o = 1;
		int count = 0;
		int[] yes = new int[20];
		for(v=0; v< yes.length, v++){
		   yes[v] = rand.nextInt(10)+1;
		   System.out.print(yes[v]+" ");
		}
   System.out.println("");
   for(o=1; o<yes.length o++){
      count = 0;
      for(int v2 = 0; v2 < yes.length; v2++){
         if(yes[v2] == 1){
            count = count +1;
            if(count > 1){
                count = 0;
                System.out.println("Weirdness at number "+(v2+1)+" of "+o)
            }
         }
      }
   }
for(v = 0; v < yes.length-1; c++){
    if(yes[v] == yes[v+1]){
        System.out.println("Conseecutive at "+(v+1)+" of "+yes[c]);
    }
}		
}

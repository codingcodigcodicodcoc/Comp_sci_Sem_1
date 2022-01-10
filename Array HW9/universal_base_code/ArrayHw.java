import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int randy = rand.nextInt(51);
	int[] arnold = new int[20];
	int yes = 0;
	arnold[0] = rand.nextInt(51);
	arnold[1] = rand.nextInt(51);
	arnold[2] = rand.nextInt(51);
	arnold[3] = rand.nextInt(51);
	arnold[4] = rand.nextInt(51);
	arnold[5] = rand.nextInt(51);
	arnold[6] = rand.nextInt(51);
	arnold[7] = rand.nextInt(51);
	arnold[8] = rand.nextInt(51);
	arnold[9] = rand.nextInt(51);
	arnold[10] = rand.nextInt(51);
	arnold[11] = rand.nextInt(51);
	arnold[12] = rand.nextInt(51);
	arnold[13] = rand.nextInt(51);
	arnold[14] = rand.nextInt(51);
	arnold[15] = rand.nextInt(51);
	arnold[16] = rand.nextInt(51);
	arnold[17] = rand.nextInt(51);
	arnold[18] = rand.nextInt(51);
	arnold[19] = rand.nextInt(51);
	while(true){
			System.out.println(arnold[yes]);
			if (yes == 19)
			{
				break;
			}
			yes=yes+1;
		}
	System.out.println("Midpoint");
	int[] Tommy = new int[20];
	int no = 0;
	Tommy[0] = arnold[19];
	Tommy[1] = arnold[18];
	Tommy[2] = arnold[17];
	Tommy[3] = arnold[16];
	Tommy[4] = arnold[15];
	Tommy[5] = arnold[14];
	Tommy[6] = arnold[13];
	Tommy[7] = arnold[12];
	Tommy[8] = arnold[11];
	Tommy[9] = arnold[10];
	Tommy[10] = arnold[9];
	Tommy[11] = arnold[8];
	Tommy[12] = arnold[7];
	Tommy[13] = arnold[6];
	Tommy[14] = arnold[5];
	Tommy[15] = arnold[4];
	Tommy[16] = arnold[3];
	Tommy[17] = arnold[2];
	Tommy[18] = arnold[1];
	Tommy[19] = arnold[0];
	while(true){
			System.out.println(Tommy[no]);
			if (no == 19)
			{
				break;
			}
			no=no+1;
		}
	}
}
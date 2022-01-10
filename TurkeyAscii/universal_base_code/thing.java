import java.util.Scanner;
import java.util.Random;

class thing{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Summon da turkey, type turkey");
String chalupa = sc.nextLine();
int c;
if(chalupa.equals("Turkey")  || chalupa.equals("turkey")){
String[]turkey = new String[21];
 turkey[0]="_____";
 turkey[1]="     \\___            ____";
 turkey[2]="           \\_     /  /    \\";
 turkey[3]="             ||  |    0    |";
 turkey[4]="    (             \\ \\      \\";
 turkey[5]="    \\__              \\    \\-\\";
 turkey[6]="      \\          /  \\   \\  \\\\    Everyday we stray further from god";
 turkey[7]="        \\     /     \\  \\ ";
 turkey[8]="         \\/           \\ \\";
 turkey[9]="           \\            \\\\";
turkey[10]="             \\             ||";
turkey[11]="                \\        //";
turkey[12]="                )_______||";
turkey[13]="                      //";
turkey[14]="                      ||";
turkey[15]="\\                     ||";
turkey[16]=" \\___________________//";
turkey[17]="     | |    | |     ";
turkey[18]="     | |    | |";
turkey[19]="     | |    | |";
turkey[20]="     feet)    feet)";
for(c=0; c < turkey.length; c++){
    System.out.println(turkey[c]);
}
}
}
}
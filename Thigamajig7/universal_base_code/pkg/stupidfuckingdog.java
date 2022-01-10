package pkg;
import java.util.Scanner;
import java.util.Random;

public class stupidfuckingdog{
public String name;
public int age;
public String breed;
   public stupidfuckingdog(){
   String redname = new String("Clifford");
   int redage = 3;
   String redbreed = new String("Big red Dog");
   }
   public stupidfuckingdog(String bone){
   name = new String(bone);
   int age = 1;
   breed = ("dog dog");
   }
   public stupidfuckingdog(String bone, String shih){
   name = new String(bone);
   breed = new String(shih);
   age = 1;
   }
   public stupidfuckingdog(String bone,int tzu){
   name = new String(bone);
   age = tzu;
   breed = ("dog dog");
   }
   public void setName(String bone){
   name = new String(bone);
   }
   public void setAge(int tzu){
   tzu = age;
   }
   public void setBreed(String shih){
   breed = new String(shih);
   }
   public String getName(){
   return name;
   }
   public int getAge(){
   return age;
   }
   public String getBreed(){
   return breed;
   }
   public boolean isSleepers(){
   Random rand = new Random();
   int rand1 = rand.nextInt(2);
   if (rand1 == 1){
      return true;
   }
   else
   {
      return false;
   }
   }
   public void bork(){
   System.out.println(name+" just barked");
   }
}
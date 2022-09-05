import java.util.Scanner;

public class assignment {
 public static void main(String arg[]){


     Scanner sc = new Scanner(System.in);

     System.out.println("enter your name");
     String name = sc.nextLine();

     System.out.println("enter your age");
     int age = sc.nextInt();

     System.out.println("enter your blood group");
     String blood;
     blood = sc.next();

     System.out.println("name: " +name);
     System.out.println("age: " + age);
     System.out.println("blood group: " + blood);

     // if--else--statement
     if(age>=20){
         System.out.println(" your group : RED");
     }else if (age>=15){
         System.out.println(" your group : BLUE");
     }else{
         System.out.println(" your group : YELLOW");
     }




 }
}

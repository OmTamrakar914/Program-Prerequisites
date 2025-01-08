import java.util.*;

public class Volume_of_Cylinder{

 public static void main(String []args){

  Scanner sc = new Scanner(System.in);

  double radius = sc.nextInt();
  double height = sc.nextInt();
  double volume = volume = 3.14 * radius * radius * height;

  
   System.out.println("Volume of Cylinder = "+volume);

   }
}
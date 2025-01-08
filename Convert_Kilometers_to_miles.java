import java.util.*;

public class Convert_Kilometers_to_miles{

 public static void main(String []args){

  Scanner sc = new Scanner(System.in);

  System.out.println("enter the kilometers");
  double kilometer = sc.nextInt();
  
  double miles = miles = kilometer * 0.621371;

  
   System.out.println("Miles to equilvalent kilometers = "+miles);

   }
}
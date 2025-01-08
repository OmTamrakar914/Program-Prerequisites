import java.util.*;

public class Average_of_Three_Numbers{

 public static void main(String []args){

  Scanner sc = new Scanner(System.in);

  System.out.println("enter the three number");
  double a = sc.nextInt();
  double b = sc.nextInt();
  double c = sc.nextInt();
  double average = ( a + b + c)/3;

  
   System.out.println("Average of three numbers = "+average);

   }
}
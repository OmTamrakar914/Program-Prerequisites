import java.util.*;

public class Power_Calculation{


 public static double power(double base, double expo){
   if(expo == 0){

    return 1;
    }
  return base * power(base , expo-1);

  }

 public static void main(String []args){

  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the base");
  double base = sc.nextInt();
  System.out.println("Enter the exponential");

  double exponential = sc.nextInt();
  
  double answer = power(base , exponential);

  
   System.out.println("Power Calculated answer = "+answer);

   }
}
import java.util.*;

public class Celsius_to_Fahrenheit_Conversion{

 public static void main(String []args){
  
   Scanner sc = new Scanner(System.in);
   double Celsius = sc.nextInt();

  int fahrenheit = (Celsius * 9/5) + 32;

  System.out.println("Temperature in Fahrenheit = "+fahrenheit);

   }
}
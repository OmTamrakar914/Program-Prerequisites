import java.util.*;

public class Simple_Interest{

 public static void main(String []args){

  Scanner sc = new Scanner(System.in);

  double principal = sc.nextInt();
  double rate = sc.nextInt();
  double time = sc.nextInt();
  double simple_interest = (principal * rate * time)/100;

  
   System.out.println("Simple interest = "+simple_interest);

   }
}
import java.util.Scanner;
public class Factorial{
       public static void main(String[] args){
           Scanner scanner=new Scanner(System.in);
           System.out.print("enter a number:");
           int num=scanner.nextInt();
           int factorial=1;
           for (int i=1; i<=num; i++){
                factorial *= i;
           }
           System.out.println("the factorial of number is:"+factorial);
      }
}
         
         
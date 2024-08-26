import java.util.Scanner;
 
public class IT24100239Lab5Q1 {

 
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
  
    int num1,num2,num3,min,max;
    
    System.out.print("Enter the first integer:");
    num1 = input.nextInt();

    System.out.print("Enter the second integer:");
    num2 = input.nextInt();

    System.out.print("Enter the third integer:");
    num3 = input.nextInt();
 
    min=num1;
    max=num1;
   
    if (num2<min){
        min=num2;
    }

    if (num2>max){
        max=num2;
    }

    if (num3<min){
        min=num3;
    }

    if (num3>max){
        max=num3;
    }

             System.out.println("User entered numbers are: "+num1+" "+num2+" "+num3);
             System.out.println("The smallest number is: " +min);
             System.out.println("The largest number is: " +max);
   }
}

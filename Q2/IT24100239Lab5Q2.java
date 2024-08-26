import java.util.Scanner;
 
public class IT24100239Lab5Q2 {

 
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
  
    int number;
    System.out.print("Enter the number of new members introduces: ");
    number = input.nextInt();

    switch(number)
    {
    case 0 :  System.out.println("No prize");
              break;
    case 1 :  System.out.println("Price is a: pen");
              break;
    case 2 :  System.out.println("Price is a: Umbrella");
              break;
    case 3 :  System.out.println("Price is a: Bag");
              break;
    case 4 :  System.out.println("Price is a: Travelling Chair");
              break;
    case 5 :  System.out.println("Price is a: Headphone");
              break;
            
    default :
    if(number<0){
     System.out.print("Input must be a number 0 or greater");
      }
    else{
    System.out.print("Prize is a: Headphone");
      }
         
   }
 }
}
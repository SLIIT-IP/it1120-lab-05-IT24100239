import java.util.Scanner;
 
public class IT24100239Lab5Q3 {

   public static final int chargepday = 48000;
 
  public static void main(String[] args){
    Scanner input= new Scanner(System.in);
 
    int start,end,resdays;
    double amount,tamount;

    System.out.print("Enter start date (1-31): ");
    start = input.nextInt ();
    System.out.print("Enter start date (1-31): ");
    end = input.nextInt ();

    if (start>31 ||start<1 ||end>31 || end<1){
        System.out.println("Error: Dates must be between 1 and 31.");
      }
    else{
    if (end<start){
       System.out.println("Error: Start date must be less than end date.");
      }
    else { 
        System.out.println("Room charge per day: Rs. " +chargepday+ ".0/=");
        resdays = end - start;
        System.out.println("Number of days reserved: " +resdays);
        amount=resdays*chargepday;
     if(resdays<3){
     tamount=amount;
     System.out.println("Total amount to be paid: "+tamount);}
     else if (resdays==3 || resdays==4){
     tamount=amount*90/100;
     System.out.println("Total amount to be paid: "+tamount);}
     else {
     tamount=amount*80/100;
     System.out.println("Total amount to be paid: "+tamount);}
     }
   }
 }
}
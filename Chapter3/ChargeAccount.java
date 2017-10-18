// ***************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new
//   salary for an employee.  The current salary
//   and a performance rating (a String: "Excellent",
//   "Good" or "Poor") are input.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           ChargeAccount ryan = new ChargeAccount();       
           double prevBalance;
           double charge;
           double newBalance;
           double interest;
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter your previous balance: ");
           prevBalance = scan.nextDouble();
           System.out.print ("Enter the total charges: ");
           charge = scan.nextDouble();
 
           interest = ((prevBalance + charge)*0.02);
           newBalance = (prevBalance + charge) + interest;
           
           
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("=============CS Card International Statement==============");
           System.out.println("==========================================================");
           System.out.println("Previous Balance:           " + money.format(prevBalance)     + "\t\t\t==");
           System.out.println("Additional Charges:         " + money.format(charge)          + "\t\t\t==");
           System.out.println("Interest:                   " + money.format(interest)        + "\t\t\t==");
           System.out.println("New Balance:                " + money.format(newBalance)      + "\t\t\t==");
           System.out.println("                            " + "\t\t\t\t==");
           System.out.println("Minimum Payment:            " + money.format(ryan.determinePayment(newBalance)) + "\t\t\t==");
           System.out.println("==========================================================");
           System.out.println("==========================================================");
        }
   public double determinePayment(double newBal){
       double payment = 0;
       if (newBal < 50){
           payment = newBal;
        }
       else if ((newBal == 50) || ((newBal > 50) && (newBal < 300))){
           payment = 50;
        }
       else if (newBal > 300){
           payment = newBal*0.2;
        }
       return payment;
    }
}

/*       CS CARD International Statement
         ===============================
         Previous Balance:      $
         Additional Charges:    $
         Interest:              $
         New Balance:           $
 
         Minimum Payment:       $
 */       
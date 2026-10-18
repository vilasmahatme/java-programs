
import java.util.Scanner;
public class PaymentSlip 
{
        public static void main(String[] args) 
	    {
	      double balance = 5000;
			
			System.out.println("Welcome To TKA_Pay..");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter an amount : ");
			
			double amount = sc.nextDouble();

			if (amount >= 0) 
			 {

				if (amount > balance)
				 {
					System.out.println("insufficient balance");
				 } 
				  else if (amount == balance) 
				   {
					System.out.println("payment successfull, par bhai 1 raaz ki baat batata hu, Account khali ho gaya hain");
				   } 
				  else 
				    {
					System.out.println("payment successfull");
				   }
			 }

			else 
			{
				System.out.println("invalid balance");
			}

			
		}
	}

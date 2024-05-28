import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    public static Scanner input = new Scanner(System.in);
    private static int initial_balance = 500;
    public static void main(String[] args) 
    {
        dorc();
    }

    public static void dorc()
    {
        String debit = "Enter 1 for Debit"; 
        String credit = "Enter 2 for Credit";
        String exit = "Enter 3 for Exit";
        System.out.print(debit + "\n--------------------\n" +credit + "\n--------------------\n" + exit + "\n--------------------\n");
        int dc = input.nextInt();

        try
        {

            switch (dc) {
                case 1:
                    
                    System.out.print("Debit Balance");
                    debitbalance();
                    break;
            

                case 2:
                    System.out.print("Credit Balance");
                    creditbalance();
                    break;
                case 3:
                    System.out.println("Thank you for using the program!");
                    break;


                default:
                    break;
            }
        }
        catch(InputMismatchException im)
        {
            if(dc>=4)
            System.out.println("Invalid Input!");
        }
        
    }

    public static void debitbalance()
    {
        ArrayList<String> history = new ArrayList<>();
        
        final String currency = "Balance: $" ;

        System.out.println(currency + initial_balance);

        String cash_in = "Enter 1 for Cash In"; 
        String cash_out = "Enter 2 for Cash Out";
        String exit = "Enter 3 for Exit";

        System.out.print(cash_in + "\n--------------------\n" +cash_out + "\n--------------------\n" + exit + "\n--------------------\n");
        int in_out = input.nextInt();

        switch (in_out) {
            case 1:
                
                System.out.print("How much to Cash in: ");
                int in_transaction = input.nextInt() ;

                initial_balance = initial_balance + in_transaction;

                String history_in = "Cash in of $" + in_transaction;

                System.out.println(history_in);

                history.add(history_in);
                System.out.println("Transaction History:");
        
                for (String str : history) {
                    System.out.println(str);
                }
    
                System.out.println("New balance: " + initial_balance);
                debitbalance();
                break;
        

            case 2:
                System.out.print("How much to Cash out: ");
                int out_transaction = input.nextInt() ;

                initial_balance = initial_balance - out_transaction;

                String history_out = "Cash out of $" + out_transaction;

                System.out.println(history_out);

                history.add(history_out);
                System.out.println("Transaction History:");
        
                for (String str : history) {
                    System.out.println(str);
                }
    
                System.out.println("New balance: " + initial_balance);
                debitbalance();
                break;
            case 3:
                System.out.println("Thank you for using the program!");
                break;


            default:
                break;
        }
    }

    public static void creditbalance()
    {
        ArrayList<String> history = new ArrayList<>();
        
        final String currency = "Balance: $" ;

        System.out.println(currency + initial_balance);

        String cash_in = "Enter 1 for Cash In"; 
        String cash_out = "Enter 2 for Cash Out";
        String exit = "Enter 3 for Exit";

        System.out.print(cash_in + "\n--------------------\n" +cash_out + "\n--------------------\n" + exit + "\n--------------------\n");
        int in_out = input.nextInt();

        switch (in_out) {
            case 1:
                
                System.out.print("How much to Cash in: ");
                int in_transaction = input.nextInt() ;

                initial_balance = initial_balance + in_transaction;

                String history_in = "Cash in of $" + in_transaction;

                System.out.println(history_in);

                history.add(history_in);
                System.out.println("Transaction History:");
        
                for (String str : history) {
                    System.out.println(str);
                }
    
                System.out.println("New balance: " + initial_balance);
                creditbalance();
                break;
        

            case 2:
                System.out.print("How much to Cash out: ");
                int out_transaction = input.nextInt() ;

                initial_balance = initial_balance - out_transaction;

                String history_out = "Cash out of $" + out_transaction;

                System.out.println(history_out);

                history.add(history_out);
                System.out.println("Transaction History:");
        
                for (String str : history) {
                    System.out.println(str);
                }
    
                System.out.println("New balance: " + initial_balance);
                creditbalance();
                break;
            case 3:
                System.out.println("Thank you for using the program!");
                break;


            default:
                break;
        }
    }
}

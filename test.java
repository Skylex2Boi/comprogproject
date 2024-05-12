import java.util.ArrayList;
import java.util.Scanner;

public class test {

    private static int initial_balance = 500;
    public static void main(String[] args) 
    {
        balance();
    }
    public static void balance()
    {
        Scanner input = new Scanner(System.in);
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
                balance();
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
                balance();
                break;
            case 3:
                System.out.println("Thank you for using the program!");
                break;


            default:
                break;
        }
    }
}

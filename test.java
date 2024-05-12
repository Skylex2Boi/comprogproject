import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        
        final String currency = "Balance: $" ;
        int initial_balance = 500;

        System.out.println(currency + initial_balance);

        String cash_in = "Cash In 1"; 
        String cash_out = "Cash Out 2";

        System.out.print(cash_in + " --- " +cash_out);
        System.out.print( '\n'+"Choose:");
        int in_out = input.nextInt();

        switch (in_out) {
            case 1:
                
                System.out.print("How much to Cash in:");
                int in_transaction = input.nextInt() ;

                initial_balance = initial_balance + in_transaction;

                String history_in = "Cash in of $" + in_transaction;

                System.out.println(history_in);

                history.add(history_in);

                break;
        

            case 2:
                System.out.print("How much to Cash:");
                int out_transaction = input.nextInt() ;

                initial_balance = initial_balance - out_transaction;

                String history_out = "Cash in of $" + out_transaction;

                System.out.println(history_out);

                history.add(history_out);

                break;
                


            default:
                break;
        }

        System.out.println("Transaction History:");
        
        for (String str : history) {
            System.out.println(str);
        }
    
        System.out.println(initial_balance);

    }
}

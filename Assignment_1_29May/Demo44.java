// A shop will give discount of 10% if the cost of purchased quantity is more than 1000. Ask user for 
// quantity  Suppose, one unit will cost 100.  Judge and print total cost for user.
import java.util.Scanner;

public class Demo44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int totalCost = quantity * 100;

        if (totalCost > 1000) {
            totalCost = totalCost - (totalCost * 10 / 100);
        }

        System.out.println("Total Cost = " + totalCost);

        // sc.close();
    }
}


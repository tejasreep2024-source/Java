//  Write a program to input electricity unit charges and calculate total electricity bill  according
//  to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs.  0.75/unit For 
// next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional  surcharge of 20% is
//  added to the bill. 
import java.util.Scanner;

class Demo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 50) {
            bill = units * 0.50;
        }
        else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        }
        else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        }
        else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20
                    + (units - 250) * 1.50;
        }

        double surcharge = bill * 20 / 100;
        double totalBill = bill + surcharge;

        System.out.println("Electricity Bill = " + bill);
        System.out.println("Surcharge = " + surcharge);
        System.out.println("Total Bill = " + totalBill);

        // sc.close();
    }
}

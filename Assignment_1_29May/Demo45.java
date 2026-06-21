//  .A company decided to give bonus of 5% to employee if his/her year of service is more  than 5 years.
// Ask user for their salary and year of service and print the net bonus amount

import java.util.Scanner;

public class Demo45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 5 / 100;
            System.out.println("Bonus Amount = " + bonus);
        } else {
            System.out.println("Bonus Amount = 0");
        }

        sc.close();
    }
}
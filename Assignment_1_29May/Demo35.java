// W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.  For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then  convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to  Fahrenheit.  
import java.util.Scanner;

class Demo35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter choice (C/F): ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = sc.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius = " + celsius);
        }
        else if (choice == 'F' || choice == 'f') {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit = " + fahrenheit);
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
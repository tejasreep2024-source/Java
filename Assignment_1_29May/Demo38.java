// Write a program to input choice from user. If user enter ‘+’ as choice then  calculate addition 
// of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check 
// both number is equal or not. 
import java.util.Scanner;

class Demo38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter choice (+, >, =): ");
        char choice = sc.next().charAt(0);

        if (choice == '+') {
            System.out.println("Sum = " + (num1 + num2));
        }
        else if (choice == '>') {
            if (num1 > num2)
                System.out.println(num1 + " is greater");
            else if (num2 > num1)
                System.out.println(num2 + " is greater");
            else
                System.out.println("Both numbers are equal");
        }
        else if (choice == '=') {
            if (num1 == num2)
                System.out.println("Both numbers are equal");
            else
                System.out.println("Both numbers are not equal");
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

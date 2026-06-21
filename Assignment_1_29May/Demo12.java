// Java Program to Swap Two Numbers

import java.util.Scanner;

class Demo12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2=sc.nextInt();
         System.out.println("Values of num1 before swapping :"+num1 );
        System.out.println("Values of num2 before swapping :"+num2 );

        int temp;
         temp=num1;
         num1=num2;
         num2=temp;

        System.out.println("Values of num1 After swapping :"+num1 );
        System.out.println("Values of num2 After swapping :"+num2 );
    sc.close();

    }
}

// WAP to enter 2 number and both numbers are equal or not, if not then find out greater
// number.

import java.util.Scanner;

class Demo18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = sc.nextInt();
        System.out.println("Enter a number :");
        int num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("Both Number are Equal");
        }
        else if (num1<num2){
            System.out.println(num2+": is Greater than " + num1);
        }
        else {
            System.out.println(num1+": is Greater than " + num2);
        }
        
    sc.close();

    }
}
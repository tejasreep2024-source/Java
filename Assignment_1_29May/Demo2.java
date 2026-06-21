// Wap to check if number is even or odd

import java.util.Scanner;

class Demo2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your number:");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("You Entered Even Number");
        }
        else{
            System.out.println("You Entered Odd Number");
        }

    sc.close();
    }
}
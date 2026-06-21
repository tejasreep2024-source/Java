// Check if a Number is Positive or Negative using if else

import java.util.Scanner;

class Demo14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num1 = sc.nextInt();

        if(num1>=0){
          System.out.println("Entered Number is a Positive number : ");   
        }
        else{
            System.out.println("Entered Number is a Negative number : ");   
        }
    sc.close();
    }
}
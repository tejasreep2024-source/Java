// wap to check if two given integer value is in range of 18 and 100 print eligible for voting
// else not eligible .

import java.util.Scanner;

class Demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number: ");
        int num1=sc.nextInt();
        System.out.println("Enetr another Number:");
        int num2 =sc.nextInt();

        if((num1>=18 && num1<=100)&&(num2>=18 && num2<=100)){
            System.out.println("Eligible for vote ");
        }
        else{
            System.out.println("Sorry You are not Eligible for Vote");
        }
    sc.close();
    }
}

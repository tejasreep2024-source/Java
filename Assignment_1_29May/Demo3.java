// wap to check from three given number that whether a number is greater than or equal to
// 20 and less than other numbers .print appropriate message .

import java.util.Scanner;

class Demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int num3 = sc.nextInt();
     
        if (num1>=20 && num1<num2 && num1<num3){
            System.out.println(num1+":statisfied given condition");
        }
        else if (num2>=20 && num2<num1 && num2<num3){
            System.out.println(num2+":statisfied given condition");
        }
        else if (num3>=20 && num3<num1 && num3<num2){
            System.out.println(num3+":statisfied given condition");
        }
        else{
            System.out.println("Sorry your Numbers doesnt statify the given condition");
        }
    // sc.close();
    }
}

// -----------------------------------------------------------------------------------------------------
// DOUBT OUTPUT GLT BATA rha

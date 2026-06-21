// Write a program in java that ask three numbers from user and print the greatest among
// three .

import java.util.Scanner;

class Demo10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int num3 = sc.nextInt();
        if (num1 >num2 && num1>num3){
            System.out.println(num1+"is Greatest");
        }
        else if(num2 >num1 && num2>num3){
            System.out.println(num2+"is Greatest");
        }
        else if(num3 >num1 && num3>num2){
            System.out.println(num3+"is Greatest");
        }
        else{
            System.out.println("Try diff only !for now because at that programmer was quite lazy to code == consditions");
        }
    sc.close();
    }
}

// try this one also 
// import java.util.Scanner;

// class GreatestNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int num3 = sc.nextInt();

//         if (num1 >= num2 && num1 >= num3) {
//             System.out.println(num1 + " is the greatest number");
//         }
//         else if (num2 >= num1 && num2 >= num3) {
//             System.out.println(num2 + " is the greatest number");
//         }
//         else {
//             System.out.println(num3 + " is the greatest number");
//         }

//         sc.close();
//     }
// }
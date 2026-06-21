// Java program to print sum of three float numbers

// class Demo1{
//     public static void main(String[] args) {
//        float f1=98.23f;
//        float f2=89.9f;
//        float f3=34.888f;
       
//     float sum=f1+f2+f3;
//        System.out.println("The Sum of 3 Floating Numbers is:"+sum);
//     }
// }

import java.util.Scanner;

class Demo1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your 1st floating number");
        float num1=sc.nextFloat();

        System.out.println("Enter your 2nd floating number");
        float num2=sc.nextFloat();

        System.out.println("Enter your 3rd floating number");
        float num3=sc.nextFloat();
        
        float sum=num1+num2+num3;
        System.out.println("Sum of 3 Floating Number is :"+sum);
    sc.close();
    }
}
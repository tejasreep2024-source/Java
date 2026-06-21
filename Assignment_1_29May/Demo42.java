//  Java program to check whether the triangle is valid or not if angles are given.
//  Hint:- The  angle property of the triangle says that the sum of all three angles should be
//  equal to 180.
import java.util.Scanner;

class Demo42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        if (a + b + c == 180) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is not valid");
        }

        sc.close();
    }
}
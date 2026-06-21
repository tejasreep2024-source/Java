// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. 
// Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides
//  of equal  length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in
//  which all three  sides are equal. Scalene triangle: A scalene triangle is a triangle that has 
// three unequal sides
import java.util.Scanner;

public class Demo43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } 
        else {
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}
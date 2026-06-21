// wap to convert height  cm into inches
import java.util.Scanner;

class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();

        double cm = inches * 2.54;

        System.out.println("Height in centimeters = " + cm);

        sc.close();
    }
}
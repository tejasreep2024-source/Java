// Write a program to Convert temperature from Fahrenheit to Celsius.

import java.util.Scanner;

class Demo19{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the temperature to convert into celcius :");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println(" temperature in celcius :" +celsius);
    sc.close();
    }
}

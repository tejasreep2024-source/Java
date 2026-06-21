// WAP to ask name ,age and salary of an employee and print on console.

import java.util.Scanner;

class Demo7{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your Age:");
        int age = sc.nextInt(); 
        System.out.println("Enter your Salary:");
        double salary = sc.nextDouble();
        
        
       System.out.println("Employee Name : " +name);
       System.out.println("Employee Age : " +age);
       System.out.println("Employee Salary : " +salary);
    // sc.close();
    }
}
// ----------------------------------------------------------------------
// java program ko console me kese run kare?
// is it for js
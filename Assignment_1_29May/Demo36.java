// Write a Java program to input basic salary of an employee and calculate its Gross  salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
// Basic Salary <= 20000 : HRA = 25%, DA = 90%  
// Basic Salary > 20000 : HRA = 30%, DA = 95% 
import java.util.Scanner;

class Demo36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra, da, grossSalary;

        if (basicSalary <= 20000) {
            hra = basicSalary * 20 / 100;
            da = basicSalary * 80 / 100;
        }
        else if (basicSalary <= 20000) {
            hra = basicSalary * 25 / 100;
            da = basicSalary * 90 / 100;
        }
        else {
            hra = basicSalary * 30 / 100;
            da = basicSalary * 95 / 100;
        }

        grossSalary = basicSalary + hra + da;

        System.out.println("HRA = " + hra);
        System.out.println("DA = " + da);
        System.out.println("Gross Salary = " + grossSalary);

        // sc.close();
    }
}
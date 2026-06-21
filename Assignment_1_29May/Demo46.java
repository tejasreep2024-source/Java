// Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following  rules print their place of service. 
// if employee is female, then she will work only in urban areas. 
// if employee is a male and age is in between 20 to 40 then he may work in anywhere if employee is male and age is in between 40 t0 60 then he will work in urban areas only. And any other input of age should print "ERROR". 
import java.util.Scanner;

public class Demo46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Sex (M/F): ");
        char sex = sc.next().charAt(0);

        System.out.print("Enter Marital Status (Y/N): ");
        char maritalStatus = sc.next().charAt(0);

        if (sex == 'F' || sex == 'f') {
            System.out.println("Place of Service: Urban Areas");
        }
        else if ((sex == 'M' || sex == 'm') && age >= 20 && age <= 40) {
            System.out.println("Place of Service: Anywhere");
        }
        else if ((sex == 'M' || sex == 'm') && age > 40 && age <= 60) {
            System.out.println("Place of Service: Urban Areas");
        }
        else {
            System.out.println("ERROR");
        }

        sc.close();
    }
}
// arithmetic operation using switch case
import java.util.Scanner;
class Demo29 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        System.out.println("Enter value of A:");
        int a = sc.nextInt();
        System.out.println("Enter value of B:");
        int b = sc.nextInt();

        switch(choice){
            case 1: System.out.println("Addition is :" +(a+b));
            break;
            case 2:System.out.println("Subtraction is:"+(a-b));
            break;
            case 3:System.out.println("Multiplication is:"+(a*b));
            break;
            case 4:System.out.println("Division is"+(a/b));
            break;
        }

    sc.close();
    }
    
}

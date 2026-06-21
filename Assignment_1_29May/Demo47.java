import java.util.Scanner;

public class Demo47 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        if(attendance >= 75) {
            System.out.println("Allowed to sit in exam");
        } else {
            System.out.println("Not allowed to sit in exam");
        }

        sc.close();
    }
}
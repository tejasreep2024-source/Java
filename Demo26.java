// *
// *#
// *#*
// *#*#
// *#*#*
import java.util.Scanner;

class Demo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                if (j%2==0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
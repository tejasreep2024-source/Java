// A
// AB
// A C
// A D
// ABCDE
import java.util.Scanner;

class Demo22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == num || i == j) {
                     System.out.print((char)('A' + j - 1));
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
// 1
// 22
// 3 3
// 4 4
// 55555
import java.util.Scanner;

class Demo21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == num || i == j) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
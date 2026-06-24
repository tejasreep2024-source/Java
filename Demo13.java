// 1
// 01
// 101
// 0101
// 10101
import java.util.Scanner;

class Demo13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            for(int j = 0; j <i; j++) {
                System.out.print((i + j) % 2);
            }

            System.out.println();
        }

        sc.close();
    }
}
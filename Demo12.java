// a
// ab
// abc
// abcd
// abcde
import java.util.Scanner;

class Demo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {

            for(int j = 0; j <i; j++) {
                System.out.print((char)('a' + j));
            }

            System.out.println();
        }

        sc.close();
    }
}
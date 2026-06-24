// a
// bc
// def
// ghij
// klmno
import java.util.Scanner;

class Demo16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        char ch = 'a';

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

        sc.close();
    }
}
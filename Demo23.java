// a
// bc
// d f
// g j
// klmno
import java.util.Scanner;

class Demo23 {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'a';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (i == 1 || i == n || j == 1 || j == i) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }

                ch++;
            }

            System.out.println();
        }
    }
}
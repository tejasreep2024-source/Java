// *
//   *
//     *
//       *
//         *
import java.util.Scanner;

class Demo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {

            for(int j = 0; j <= i; j++) {

                if(i == j)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }
}
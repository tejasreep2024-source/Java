// 12345
// 12345
// 12345
// 12345
// 12345
import java.util.Scanner;

class Demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i = 0; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    sc.close();
    }
}
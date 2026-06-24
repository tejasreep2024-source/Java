// *****

import java.util.Scanner;

class Demo1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        for(int i=0;i<=num;i++){
            System.out.print("*");
        }
    sc.close();
    }
}
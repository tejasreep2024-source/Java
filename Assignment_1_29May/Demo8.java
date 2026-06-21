// wap that ask two numbers from user and print greater number among two
import java.util.Scanner;
class Demo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st Number:");
        int num1 =sc.nextInt();
        System.out.println("Enter your 2nd Number:");
        int num2 =sc.nextInt();

        if(num1>num2){
            System.out.println(num1+":is greater than " +num2);
        }
        else {
            System.out.println(num2+":is greater than " +num1);
        }
        
    sc.close();
    }
}
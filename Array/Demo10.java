// wap to find and print even numbers in given array
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers are:");

        for(int i = 0; i < size; i++) {

            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
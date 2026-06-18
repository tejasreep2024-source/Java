// wap to define an array of integer of size 6 .Take input from user and display it in reverse
// order

import java.util.Scanner;

class Demo6{
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=6;
        int arr[]=new int[size];
        System.out.println("Enter Array elements:");
        for(int i=0;i<size;i++){
                        arr[i] = sc.nextInt();
        }
        System.out.println("Array in reverse order:");
        for(int i = 5; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
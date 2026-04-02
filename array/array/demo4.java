//"No. of elements lies in between 50 and 60

import java.util.Scanner;
class demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int size=sc.nextInt();
        int i;
        int arr[]=new int[size];
        System.out.println("enter array elements:");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        System.out.println("enter arrray elemweents:");
        for(i=0;i<arr.length;i++){
            if (arr[i]>50 && arr[i]<60)
            c++;
            System.out.println(arr[i]);
        }
        System.out.println("No. of elements lies in between 50 and 60 : " +c);
        sc.close();
    }
    
}

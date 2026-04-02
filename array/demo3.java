import java.util.Scanner;
class demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        int size=sc.nextInt();
        int i;
        int arr[]=new int[size];
        System.out.println("enter array elements: ");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("\nSum of first and last element : "+(arr[0]+arr[size-1]));
    }
    
}

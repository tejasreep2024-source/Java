// Example showing the concept of 2d array
import java.util.Scanner;
class Demo23
{
    public int[] getArrayElements(int newArr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements : ");
        for(int i=0;i<newArr.length;i++){
            newArr[i] = sc.nextInt();
        }
        return newArr;
    }
    public int[] getReverseArrayElements(int newArr[]){
        for(int i=0;i<newArr.length/2;i++){
            int temp = newArr[i];
            newArr[i] = newArr[newArr.length-1-i];
            newArr[newArr.length-1-i] = temp;
        }
        return newArr;
    }
    public void printArrayElements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("\t"+arr[i]);
        }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size : ");
       int size = sc.nextInt();
       int i,arr[] = new int[size];
       Demo23 obj = new Demo23();
       
       arr = obj.getArrayElements(arr); 
        System.out.println("Array elements are : ");
        obj.printArrayElements(arr);
        
       arr = obj.getReverseArrayElements(arr); 
        System.out.println("\nArray elements after reversing : ");
        obj.printArrayElements(arr);
    sc.close();
    }
}
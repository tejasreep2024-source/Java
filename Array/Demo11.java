// Insert element at  psotition 2 of given array

    
public class Demo11 {
    public static void main(String[] args) {
        int arr[] = {10,25,5,40,15,0};

        int size = 5;
        int position = 2;
        int value = 100;

        for(int i=size;i>position;i--) {
            arr[i]=arr[i-1];
        }
        arr[position]=value;
        // size++;
        for(int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

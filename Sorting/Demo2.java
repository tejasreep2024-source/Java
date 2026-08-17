// Find Second largest element of array 
// class Demo2{
//     public static void main(String[] args) {
//         int arr[]={40,30,10,20};
//         int temp ;

//         for( int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                    temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                 }
//             }
//          }
//         System.out.println(arr[arr.length - 2]);
//     }
// }

class Demo2{
    public static void main(String[] args) {
        int arr[]={100,20,40,70,60,10,80};

        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("second largest elemnet:"+secondLargest);
        System.out.println("largest elemnet:"+largest);
    }
}

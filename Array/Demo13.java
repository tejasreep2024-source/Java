// Binary search 
class Demo13{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int key = 50;

        int low=0;
        int high=arr.length-1;
        int mid;

        while(low<=high){
            mid=(low+high)/2;
            
            if(arr[mid]==key){
                System.out.println("Element found:"+key);
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else if (arr[mid]>key){
                high=mid-1;
            }
            else{
                System.out.println("Element not Found !");
            }
        }
    }
}

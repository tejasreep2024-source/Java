// Example of 2d array
class demo15{
    public static void main(String[] args) {
        int r=3 , c=3;
        int arr[][]=new int[][]{
            {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println("array elements are: ");
         for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                 System.out.print(arr[i][j] + "\t");
            }
        System.out.println();
        }
    }
}
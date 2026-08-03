// public class Demo3 {
//     public static void main(String[] args) {
//         int a[]={100,200,300};

//         System.out.println(a[0]);
//         System.out.println(a[1]);
//         System.out.println(a[2]);
//         System.out.println(a[3]);
//         System.out.println("Healty part of the code");
//     }
// }
// ===========healty part code not exxecutes so try catch==========
public class Demo3 {
    public static void main(String[] args) {
        int a[]={100,200,300};

        try{
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]); 

        }catch(Exception e){
            e.printStackTrace();}
        System.out.println("Healty part of the code");
    }
}
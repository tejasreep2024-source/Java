// import java.io.FileInputStream;
// public class Demo1{
//     public static void main(String[] args) {
//         FileInputStream f  = new FileInputStream("C:\\Users\\PC\\OneDrive\\Desktop\\full stack");
//     }
// }
// invalid path tho compile time exception 

// =====================================================================
import java.io.FileInputStream ;

class Demo1{
    public static void main(String[] args) {
        try{
        FileInputStream  f = new FileInputStream("d:/abc.txt");
        }catch(Exception e){
            //  System.out.println(e);
        }
    }
}
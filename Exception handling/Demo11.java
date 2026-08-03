// FINALLY
// finally =>The finally block is used to execute code whether an exception occurs or not. It is mainly used for resource cleanup, such as closing files, database connections, or scanners.


//     public static void main(String args[]){
//         try{
//             String s = null;
//             System.out.println(s.length());

//         }catch(Exception e){
//             e.printStackTrace();

//         }
//         finally{
//          System.out.println("code which is inside the finally block always execute");
//         }
//     }
// }

//..........................//
import java.util.Scanner;
class Demo11{
    public static void main(String args[]){
        try{
           Scanner s = new Scanner(System.in);
            System.out.println("plz enter the  no");
            int n = s.nextInt();
            System.out.println(10/n);


        }catch(Exception e){
            e.printStackTrace();

        }
        finally{
         System.out.println("code which is inside the finally block always execute");
        }
    }
}
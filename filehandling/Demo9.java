import java.io.*;
class Demo9{
    public static void main(String args[]){
        try{
   FileOutputStream f = new FileOutputStream("xyz.txt");
//    f.write(65);
   f.write('S');
   f.write('h');
   f.write('v');
   f.write('i');
   f.write('i');
   f.write('i');
   f.write('i');
   


   System.out.println("data created");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
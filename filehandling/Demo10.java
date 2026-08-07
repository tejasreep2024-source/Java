import java.io.*;
class Demo10{
    public static void main(String args[]){
        try{
   FileOutputStream f = new FileOutputStream("xyz.txt");
//    f.write(65);
//    f.write('S');
//    f.write('a');
//    f.write('n');
//    f.write('d');
//    f.write('h');
//    f.write('y');
//    f.write('a');
    String data = "I am Sandhya";
    byte b[] = data.getBytes();
    f.write(b);
   
   System.out.println("data created");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
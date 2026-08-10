import java.io.*;
class Demo14{
    public static void main (String args[]){
        try{
           FileInputStream fis = new FileInputStream("xyz.txt");
           int count = 0;
           while (fis.read() != -1){
            count++;
           }
           fis.close();
           System.out.println("Counting letter in files :" + count);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
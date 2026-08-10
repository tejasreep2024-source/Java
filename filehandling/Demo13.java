// /data transfer fromm one folder to another folder
import java.io.*;
class Demo13{
    public static void main(String args[]){
        try{
            FileInputStream fis = new  FileInputStream("xyz.txt");
            FileOutputStream fos = new FileOutputStream("abc.txt");
            int data;
            while((data = fis.read()) != -1){
                fos.write(data);
            }
            fis.close();
            fos.close();
            System.out.println("Data successfully read");
            System.out.println("Data successfully write");


        }catch(Exception e){
            System.out.println(e);

        }
    }
}
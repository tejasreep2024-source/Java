import java.io.*;
class Demo12{
    public static void main(String args[]){

        try{
        FileInputStream fr = new FileInputStream("xyz.txt");
        int ch;
            
         while((ch=fr.read()) != -1){
            System.out.print((char)ch);
         }   
        }catch(Exception e){
         System.out.println(e);
        }
    }

        }
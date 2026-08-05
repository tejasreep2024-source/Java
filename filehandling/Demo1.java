import java.io.*;
public class Demo1 {
  public static void main(String[] args) {
    try{
        File file = new File("Sandhaya Rokade");
        if(file.createNewFile()){
            System.out.println("File Created");
        }else{
            System.out.println("File Not Created");
        }
    }catch(Exception e){

    }
  }   
}

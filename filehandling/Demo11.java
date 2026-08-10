import java.io.*;
public class Demo11{
  public static void main(String[] args) {
    try{
        FileOutputStream fos = new FileOutputStream("abc.txt",true);
        String data ="\n react node";
        fos.write(data.getBytes());
        fos.close();
        System.out.println("Data created susccesfully");
    }catch(Exception e){
        System.out.println(e);
    }
  }
}


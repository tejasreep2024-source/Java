import java.io.*;
public class Demo2 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("xyz.txt");
            fw.write("Hello java,I am a coder");
            fw.close();
        }catch(Exception e){

        }
    }
}

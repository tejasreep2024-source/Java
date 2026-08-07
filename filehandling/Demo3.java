import java.io.FileReader;


public class Demo3{
public static void main(String[] args) {
    try{
        FileReader fr = new FileReader("abc.txt");
        int ch;

        while((ch = fr.read()) !=-1){
            System.out.print((char)ch);
        }
    }catch (Exception e){
        System.out.println(e);
    }
    }
}
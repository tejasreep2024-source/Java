import java.io.*;


public class Demo5{
    public static void main(String[] args) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("abc txt"));
            bw.write("MERN-stack");
            bw.newLine();
            bw.write("java");
            System.out.println("Data created");
            bw.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
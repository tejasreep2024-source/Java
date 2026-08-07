import java.io.*;
class Demo8{
    
    public static void main(String args[]){
        File file = new File("xyz.txt");
        if (file.exists()){

            System.out.println("Name :"+file.getName());
            System.out.println("Path :"+file.getAbsolutePath());
            System.out.println("Size :"+file.length());
            System.out.println("Readable :"+file.canRead());
            System.out.println("Writable :"+file.canWrite());


        }
    }
}
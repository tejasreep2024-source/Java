import java .util.ArrayList;

public class Demo9{
    public static void main(String[]args){
        ArrayList al = new ArrayList();
        al.add(0 ,  "jayaa");
        al.add(1,  "Tejaa");
        al.add(2 ,  "somyaa");

        System.out.println(al.get(1));
        al.set(1 , "Sandhya");
         System.out.println(al);
        //  size
        System.out.println(al.size());
    }
}

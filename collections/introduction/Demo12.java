import java.util.ArrayList;
import java.util.List;

public class Demo12{
    public static void main (String[]args){
        List l = new ArrayList();
        l.add(0,1);
        l.add(1,2);
        l.add(2,null);
        l.add(3,4);
        l.add(4,null);

        System.out.println(l);

    }
}
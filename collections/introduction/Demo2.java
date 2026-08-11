import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new  ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(34);
        list.add(17);
        Collections.sort(list);
        System.out.println(list);
    }
}

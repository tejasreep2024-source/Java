import java.util.*;

public class Demo11{
    public static void main (String[]args){

        ArrayList name = new ArrayList();
        name.add("Anu");
        name.add("Manu");
        name.add("Tanu");
        System.out.println(name.contains("Tanu"));

        ArrayList check = new ArrayList();
        check.add("Naviii");
        check.add("Savii");
        System.out.println(name.containsAll(check));
    }
}
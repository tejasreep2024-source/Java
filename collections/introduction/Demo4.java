import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Sita");
        al.add("Gita");
        al.add("Mita");

        System.out.println(al);

        ArrayList<String> all = new ArrayList<>();

        all.add("Siyaa");
        all.add("Diyaa");
        all.add("Jiyaa");

        System.out.println(all);

        System.out.println(al.addAll(all));
        System.out.println(al);
    }
}

import java.util.ArrayList;

public class Demo7{
    public static void main(String[]args){
        ArrayList al = new ArrayList();
        al.add("aa");
        al.add("bb");
        al.add("cc");

       System.out.println(al);

           ArrayList all = new ArrayList();
        all.add("aaa");
        all.add("bbb");
        all.add("ccc");

       System.out.println(all);

       System.out.println(al.addAll(all));
       System.out.println(al);
       System.out.println(al.removeAll(all));
       System.out.println(al);
       al.clear();
       System.out.println(all);




    }
}
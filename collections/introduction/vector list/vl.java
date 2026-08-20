import java.util.Vector;

public class vl{
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Krati");
        v.add("Muskan");
        v.add("GHost");
        System.out.println(v);
        // capacity
        System.err.println(v.capacity());
        System.out.println(v.firstElement());
        System.out.println(v.removeElement("Muskan"));
        System.out.println(v);
        v.removeElementAt(1);
        System.out.println(v);
        v.setElementAt("Supriya", 0);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);

    }
}
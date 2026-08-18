import java.util.LinkedList;

public class linkedlist{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Tejasree");
        list.add("sandhaya");
        list.add("Shivsni");
        list.add("Soumya");
        list.add(null);
        list.add("shrikhant");
        list.add(null);
        list.addFirst("Ayush");
        list.addLast("Vishal");

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.get(6));
        System.out.println(list.getLast());

        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        
        



    }
}
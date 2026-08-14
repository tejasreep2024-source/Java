 import java.util.*;
class Demo16{
    public static void main(String args[]){


        List l = new ArrayList();
        l.add(0,"sandhya");
        l.add(1,"somya");
        l.add(2,"shivani");
        l.add(3,"tejashree");
        l.add(4,"jaya");
        
        System.out.println(l);
      ListIterator itr = l.listIterator();
       
       
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        while(itr.hasPrevious()){
            System.out.println(itr.next());
        }
     }
}
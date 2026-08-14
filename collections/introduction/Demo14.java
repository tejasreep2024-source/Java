import java.util.*;
class Demo14{
    public static void main(String args[]){
        List l = new ArrayList();
        l.add(0,10);
        l.add(1,20);
        l.add(2,30);
        l.add(3,40);
        l.add(4,50);
        l.add(5,60);
        System.out.println(l);
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

     }
}
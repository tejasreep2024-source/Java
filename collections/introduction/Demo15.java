import java.util.*;
class Demo15{
    public static void main(String args[]){
    
        Set s = new HashSet();
        s.add("sandhya");
        s.add("shivani");
        s.add("tejshree");
        s.add("somya");
        s.add(null);
        s.add(null);
        System.out.println(s);
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

     }
}
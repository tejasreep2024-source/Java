import java.util.Stack;

public class Stack1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Rahul");
        s.push("Krati");
        s.push("Priyal");
        s.push(null);
        s.push("krati");
        s.push(null);
        s.push("Akash");
        s.push("Akash");

        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search("Priyal"));
        System.out.println(s.empty());

    }
}
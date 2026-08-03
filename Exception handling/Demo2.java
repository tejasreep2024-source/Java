public class Demo2 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
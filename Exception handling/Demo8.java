class Demo8{
    public static void main(String args[]){
        try{ 
            System.out.println(10/0);
            String name = null;
            System.out.println(name.length());
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest Code");
    }
}
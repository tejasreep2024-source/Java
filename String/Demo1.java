class Demo1{
    public static void main (String args[]){
        String s1=new String("Java");
        String s2=new String("Java");
        System.out.println(s1.equals(s2));
        // .equals:methods checks on the basis of data

        String s="Coding Thinkers";
        String  s3="Coding Thinkers";
        System.out.println(s==s3);
        // == checks data on the basis of memory address
        // System.out.println(s.equals(s3));

       
    }
}
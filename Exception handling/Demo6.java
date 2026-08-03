class Demo6{

    void divide(){
       try{
        int a= 10;
        int b = 0;
        System.out.println(a/b);
    }catch(Exception e){
        e.printStackTrace();
    }
    }
    void sum(){
        int a=100;
        int b= 500;
        System.out.println(a+b);
    }
    public static void main(String args[]){
        Demo6 d = new Demo6 ();
        d.divide();
        d.sum();
    }
}

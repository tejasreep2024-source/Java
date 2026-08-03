class Demo7{

    void divide(){
       
        int a= 10;
        int b = 0;
        System.out.println(a/b);
    }
    void sum(){
        int a=100;
        int b= 500;
        System.out.println(a+b);
    }
    public static void main(String args[]){
        try{
        Demo7 d = new Demo7();
        d.divide();
        }catch(Exception e){
            System.out.println(e);
        }
        Demo7 d1 = new Demo7();
        d1.sum();
    }
}
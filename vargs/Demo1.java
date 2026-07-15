// vargs => it is introduce after 1.5 version of java it is variable arguments methods in which  we can give any num of agrument to that particular method
class Demo1{

    void num(int ...a){
        System.out.println("variable arguments");
        for(int a1 : a){
            System.out.println(a1);
        }
    }
    public static void main(String args[]){
         Demo1 d = new Demo1();
         d.num(1,2);
         d.num(1,2,3,4,5);
    }
}
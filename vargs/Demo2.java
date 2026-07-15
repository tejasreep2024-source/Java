public class Demo2{
     
     void Addition(int... num){
        int sum = 0;

        for (int k : num){
            sum = sum + k;
        }

        System.out.println("Addition " + sum);
     }

     public static void main(String[] args) {
         Demo2 d = new Demo2();
         d.Addition(1,2);


     }
}

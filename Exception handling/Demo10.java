import java.util.Scanner;
class Demo10{
    public static void main(String args[]){
        try{
            try{
                int a[] = {100,200,300};
                System.out.println(a[3]);
            }catch(Exception e){
                e.printStackTrace();

            }
            System.out.println("code 1");
        }catch(Exception e){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("please enter the data");
                String d = sc.next();
                System.out.println("code 2");
                int num = Integer.parseInt(d);
            }catch(Exception ae ){
              ae.printStackTrace();
            }
            System.out.println("code 3");

        }
    }
}
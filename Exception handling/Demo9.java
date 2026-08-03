import java.util.Scanner;
class Demo9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("please  eneter division value");
        int n = sc.nextInt();
        try{
            System.out.println(10/0);
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            String str = null;
            System.out.println(str.length());
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Rest Code");
    }
}
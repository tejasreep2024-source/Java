// wap to print avg of 5 subjects marks and check average >=40 print pass eelse fail
import java.util.Scanner;
class Demo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st subject marks:");
        int sub1=sc.nextInt();
        System.out.println("enter 2nd subject marks:");
        int sub2=sc.nextInt();
        System.out.println("enter 3rs subject marks:");
        int sub3=sc.nextInt();
        System.out.println("enter 4th subject marks:");
        int sub4=sc.nextInt();
        System.out.println("enter 5th subject marks:");
        int sub5=sc.nextInt();

        int avg=(sub1+sub2+sub3+sub4+sub5)/5;
        if(avg>=40){
            System.out.println("Congrats You Passes");
        }
        else{
            System.out.println("sorry You Failed");
        }
    sc.close();
    }
}
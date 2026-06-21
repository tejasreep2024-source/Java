import java.util.Scanner;

class Demo22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks to know ur Grade :");
        int marks=sc.nextInt();

        if(marks>=80){
            System.out.print("you got A Grade ");
        }
        else if(marks>=60 && marks<80){
            System.out.print("you got B Grade ");
        }
        else if(marks>=50 && marks<60){
            System.out.print("you got C Grade ");
        }
        else if(marks>=45 && marks<50){
            System.out.print("you got D Grade ");
        }
        else if(marks>=25 && marks<40){
            System.out.print("you got E Grade ");
        }
        else if(marks<25){
            System.out.print("you Failed ");
        }
    sc.close();
    }
}
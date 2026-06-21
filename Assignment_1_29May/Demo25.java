import java.util.Scanner;

class Demo25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the percentage to know ur Grade :");
        int marks=sc.nextInt();

        if(marks>90){
            System.out.print("you got A Grade ");
        }
        else if(marks>80 && marks<=90){
            System.out.print("you got B Grade ");
        }
        else if(marks>=60 && marks<=80){
            System.out.print("you got C Grade ");
        }
        else if(marks<60){
            System.out.print("you got D Grade ");
        }
        
    sc.close();
    }
}

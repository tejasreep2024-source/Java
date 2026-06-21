// number from user ranges btw 1-7 and print day of that number

import java.util.Scanner;

class Demo24{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number Ranges btw 1-7 to get day:");
        int num=sc.nextInt();

        switch (num) {
            case 1:System.out.print("Monday");
                break;
            case 2:System.out.print("Tuesday");
                break;
            case 3:System.out.print("Wednesday");
                break;
            case 4:System.out.print("Thrusday");
                break;
            case 5:System.out.print("Friday");
                break;
            case 6:System.out.print("Saturday");
                break;
            case 7:System.out.print("Sunday");
                break;
            
            default:System.out.print("Oops !! Try Again !!");
                break;
        }
    sc.close();
     }
}

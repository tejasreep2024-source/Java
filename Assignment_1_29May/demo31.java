// leap year or not

import java.util.Scanner;

class Demo31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year to check :");
        int year=sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.print(year+": is a Leap year ");
        }
        
        else {
            System.out.print(year+": Not a Leap Year ");
        }
        
    sc.close();
    }
}

// Take values of length and breadth of a rectangle from user and check if it is square or
// not.

import java.util.Scanner;

class Demo21{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Length of the given Object : ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth of the given Object : ");
        int breadth = sc.nextInt();

        if(length==breadth ){
            System.out.println("The given Object is Square ");
        }
        else{
            System.out.println("The given Object is Rectangle ");
        }
        sc.close();
    }
}
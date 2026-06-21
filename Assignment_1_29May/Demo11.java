// WAP to find ASCIII value of a character

import java.util.Scanner;

class Demo11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character to find ASCII value:");
        // String ch = sc.next();

        char ch = sc.next().charAt(0);

        int ascii = ch;

        System.out.println("ASCII value of " + ch + " is " + ascii);
    }
}
// ------------------------------------------------------------------------------------------
// nhi aaya samaj me
// input of 3 ppl age and print oldest and youngest one

import java.util.Scanner;

class Demo23{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter 1st person age: ");
        int age1=sc.nextInt();
        System.out.println("Enter 2nd person age: ");
        int age2=sc.nextInt();
        System.out.println("Enter 3rd person age: ");
        int age3=sc.nextInt();
      
         // Logic to find the oldest age
        int oldest;
        if (age1 >= age2 && age1 >= age3) {
            oldest = age1;
        } else if (age2 >= age1 && age2 >= age3) {
            oldest = age2;
        } else {
            oldest = age3;
        }

        // Logic to find the youngest age
        int youngest;
        if (age1 <= age2 && age1 <= age3) {
            youngest = age1;
        } else if (age2 <= age1 && age2 <= age3) {
            youngest = age2;
        } else {
            youngest = age3;
        }

        System.out.println("\n--- Results ---");
        System.out.println("The Oldest age is: " + oldest);
        System.out.println("The Youngest age is: " + youngest);
    // sc.close();
    }
}
// Write a proram to input the marks of 5 subject of student. then calculate the percentage.
// if percentage is greater then 60 print you are passed with 1st divistion , if percetnage is
// between 50 to 59 then print 2nd division, if percentage is between 33 to 49 then print 3rd
// division otherwise failed. You have print the marksheet with proper formate with total marks
// obtained and division.

import java.util.Scanner;

class Demo20{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("To Know Your Result Enter The Marks !!");

       System.out.print("Enter marks for Subject 1 (out of 100): ");
        double sub1 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 2 (out of 100): ");
        double sub2 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 3 (out of 100): ");
        double sub3 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 4 (out of 100): ");
        double sub4 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 5 (out of 100): ");
        double sub5 = scanner.nextDouble();

        double totalObtained = sub1 + sub2 + sub3 + sub4 + sub5;
        double totalMaxMarks = 500.0;
        double per = (totalObtained / totalMaxMarks) * 100;

        if (per>=60){
            System.out.println("Congrats !you are passed with 1st divistion");
        }
        else if(per<=59 && per>=50){
            System.out.println("Congrats !you are passed with 2nd divistion");
        }
        else if(per<=49 && per>=33){
            System.out.println("Congrats !you are passed with 3rd divistion");
        }
        else{
            System.out.println("OOPS !! Failed..");
        }

      

    // scanner.close();
    }
}


// -------------------------------------------------------------------------------------
// Marksheet kese  print kare????
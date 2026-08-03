import java.util.Scanner;

class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        System.out.println(msg);
    }
}

public class Demo13{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the age");
        int age = s.nextInt();

        if (age  < 18){
            throw new YoungerAgeException("You are not eligible to vote u kidd");
        }else{
            System.out.println("Yeah you can vote, U adulttt");
        }
    }
}
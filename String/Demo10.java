// Pallindrome string
import java.util.Scanner;
class Demo10{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String:");    
    String str = sc.next();
    
    

    String rev = "";
    
    for ( int i = str.length()-1 ; i >= 0 ; i-- ){
        rev = rev + str.charAt(i);
    }
    if(str.equals(rev)){
    System.out.println("Yes !! Pallindrome"); }
    else{
        System.out.println("No !! Not a Pallindrome");
    }
    sc.close();  
    }
}
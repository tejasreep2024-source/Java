import java.util.Scanner;

class Demo26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of your Bike :");
        int price=sc.nextInt();

        if(price>100000){
            int tax = price * 15 / 100;
            System.out.print("your Road Tax: " +tax);
        }
        else if(price>50000 && price<=100000){
            int tax = price * 10 / 100;
            System.out.print("your Road Tax: " +tax);
        }
        else if(price<50000){
            int tax = price * 5 / 100;
            System.out.print("your Road Tax: " +tax);
        }
        
    sc.close();
    }
}

// wap to ask product name and price of product from user and calculate discount i.e
// if price > 2000 then discount is 10 percent of price
// else discount is 7 % of price
import java.util.Scanner;
class  Demo9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product Name :");
        String product_name=sc.next();
         System.out.println("Enter product price :");
        int product_price=sc.nextInt();

        if (product_price> 2000){
              int discount = product_price * 10 / 100;
              int dis = product_price-discount;
              System.out.println("Your Product :"+product_name);
              System.out.println("Discounted price :"+dis);
            }
        else{
              int discount1 = product_price * 7 / 100;
              int dis1 = product_price-discount1;
              System.out.println("Your Product :"+product_name);
              System.out.println("Discounted price :"+dis1);

            }
    sc.close();
    }
}


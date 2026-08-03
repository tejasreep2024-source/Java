class InsufficientBalanceException extends RuntimeException{

     InsufficientBalanceException(String msg) {
        System.out.println(msg);
    }


}

public class Demo12{
    public static void main(String[] args) {
        int Balance = 4000;
        int withdrawAmount = 5000;

        if (withdrawAmount > Balance){
            throw new InsufficientBalanceException ("oops sorry ! you have insufficient balance");
        } else{
            System.out.println("successfully Transaction done");

        }
    }
}
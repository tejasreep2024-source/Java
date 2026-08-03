class InsufficientBalanceException extends RuntimeException{
    InsufficientBalanceException(String msg){
        System.out.println(msg);
    }
 }
class Demo16{
    void withdrawAmount(int balance ,int Amount){
        if(Amount >balance){
            throw new InsufficientBalanceException("oops sorry ! you have insufficient balance");
        }else{
            System.out.println("your transaction done successfully");
        }
    }
    public static void main(String args[]){
       try{
        Demo16 d = new Demo16();
       d.withdrawAmount(4000,5000);
    }catch(InsufficientBalanceException e){
        e.printStackTrace();
    }
}
}


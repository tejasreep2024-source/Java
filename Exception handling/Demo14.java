class NegativeNumberException extends RuntimeException{
    NegativeNumberException(String msg){
        System.out.println(msg);
    }
 }

class Demo14{
    public static void main(String args[]){
        int num = -10;
        if(num<0){
            throw new NegativeNumberException("Nagative num not allowed");
        }else{
            System.out.println("Successfully done");
        }
    }
}

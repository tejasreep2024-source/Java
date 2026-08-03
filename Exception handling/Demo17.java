class ZeroNumberException extends RuntimeException{
    ZeroNumberException(String msg){
        System.out.println(msg);
    }
}
class Demo17{
     void number(int a , int b){
        if(b==0){
            throw new ZeroNumberException("number is 0");
        }else{
            System.out.println("number is not 0");
        }
     }
    public static void main(String args[]){
        try{
            Demo17 d =  new Demo17();
            d.number(2,0);
        }catch(ZeroNumberException e){
            e.printStackTrace();
        }

    }
}
 
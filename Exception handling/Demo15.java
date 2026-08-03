class InvalidAgeException extends RuntimeException{
    InvalidAgeException(String msg){
        System.out.println(msg);
    }
}
class Demo15{
    static void votingAge(int age)throws InvalidAgeException{
            if(age<18){
                throw new InvalidAgeException("not Eligible");
            }else{
                System.out.println("Eligible");
            }
    }
    public static void main(String args[]){
       try{
        votingAge(17);
    }catch(InvalidAgeException a){
        a.printStackTrace();
    }
}
}
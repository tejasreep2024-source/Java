// words count in a sentence 
class Demo11{
    public static void main(String[] args) {
    
    String s  = "Today is Thursday because yesterday was wednesday";
    int count = 1 ;
    for ( int i = 0 ; i <s.length() ; i++){
       if(s.charAt(i) == ' '){
        count++;

       }
    }
    System.out.println("words count :"+count );
    }
}

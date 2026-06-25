// // Duplicates character count 
// class Demo13{
//     public static void main(String[] args) {
    
//     String s = "sandhya is a best girl";

//     char ch[]=s.toCharArray();
//     int count = 0;
//     for( int i = 0 ; i < ch.length ; i++){
//         for(int j=i+1 ; j<ch.length;j++){
//             if(ch[i]==ch[j] && ch[i]!=' '){
//                 count++;
//             }
//         }
//         if(count>1 && ch[i]!='0'){
//             System.out.println("Duplicates:"+ch[i]);
//         }
//     }
//     System.out.println(count);


//     }
// }
// Duplicate characters count
class Demo13 {
    public static void main(String[] args) {

        String s = "sandhya is a best girl";

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int count = 0;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("Duplicate: " + ch[i]);
            }
        System.out.println("count : "+count);    
        }
        
    }
}
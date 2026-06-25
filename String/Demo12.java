// vowel character count 
class Demo12 {
    public static void main(String[] args) {

        String s = "I am soulfull girl";

        int vowel = 0;
        char ch[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' ||
                ch[i] == 'o' || ch[i] == 'u' ||ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' ||
                ch[i] == 'O' || ch[i] == 'U') {

                vowel++;
            }
        }

        System.out.println("Vowels = " + vowel);
    }
}
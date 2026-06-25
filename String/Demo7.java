class Demo7{
    public static void main(String[]args){
        String s1 ="java";
        String s2 ="fullstack";
        System.out.println(s1+s2);

        System.out.println(s1 + (20-3));

        System.out.println(s1.concat(s2));

        String result = String.join("|" , "pizza" , "cake","coke");
        System.out.println(result);

        String fruits[] = {"Apple","orange","banana"};
        String result1 = String.join("-" , fruits);
        System.out.println(result1);
        //----------------------------------------------//
        //subsequence()
        String s ="this is demo";
        System.out.println(s.subSequence(3,9));

        String s3 ="Helloworld";
        System.out.println(s3.substring(5));

        String s4 ="Helloworld";
        System.out.println(s4.replace("Hello","Happy"));

         String s5 ="this is demo";
         System.out.println(s5.replaceFirst("is","was"));

         String s6 ="this is demo";
         System.out.println(s6.replaceAll("is(.*)","was"));

         String s7 ="javafullstack";
         System.out.println(s7.indexOf('a'));

         System.out.println(s7.lastIndexOf('a'));

         System.out.println(s7.charAt(2));

        //  contain method

        String r = "Java";
        System.out.println(r.contains("v"));
        System.out.println(r.startsWith("R"));
        System.out.println(r.endsWith("a"));
        System.out.println(r.toUpperCase());
        System.out.println(r.toLowerCase());

        // toCharArray
        String d="Java";
        char d1[] = d.toCharArray();

        for(char ch:d1){
            System.out.println(ch);
        }
    }
}
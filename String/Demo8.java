// stringBuffer is used to generate a string and it is muttable and it is also final class 
class Demo8{
    public static void main(String[] args) {
        // String s = new String("Java");
        // String s1 =s.concat(" FullStack");
        // System.out.println(s1);

        // StringBuffer s = new StringBuffer("Java");
        // s.append(" FullStack");
        // System.out.println(s);

        // stringbuffer method

        // StringBuffer s = new StringBuffer();
        // System.out.println(s.capacity());

        // s.append("Hey Developer,welcome to coding");
        // System.out.println(s.capacity()); 
        //                                 //   (oldcapacity*2)+2
        // s.append("Developer is playing today ");
        // System.out.println(s.capacity()); 
        //                                 //   (oldcapacity*1)+2
        // s.append("Developer is out of station ");
        // System.out.println(s.capacity()); 
        //                                //   (oldcapacity*2)+2
        // StringBuffer s1 = new StringBuffer("Java");
        // System.out.println(s1.charAt(2));
        // System.out.println(s1.delete(1,3));
        // System.out.println(s1.length());

        // StringBuffer s2 = new StringBuffer("Java Developer");
        // StringBuffer s3 = new StringBuffer("Java Developer");
        // System.out.println(s2.equals(s3));

        // StringBuffer s4 = new StringBuffer("Developer1");
        // System.out.println(s4.insert(2, 76));

        // StringBuffer s5 = new StringBuffer("Developer1");
        // System.out.println(s5.replace(0, 3,"Java"));

        // StringBuffer s6 = new StringBuffer("Developer1");
        // System.out.println(s6.reverse());

        // System.out.println(s6.subSequence(2, 6));

        // System.out.println(s6.substring(1));

        // s6.setCharAt(1, 'd');
        // System.out.println(s6);

        // s6.setLength(6);
        // System.out.println(s6);

        StringBuffer s7 = new StringBuffer();
        s7.ensureCapacity(100);
        System.out.println(s7.capacity()); 
        s7.append("Hello");
        s7.trimToSize();
        System.out.println(s7.capacity());
        System.out.println(s7.indexOf("o"));
        System.out.println(s7.lastIndexOf("l"));


        
        
    }

}

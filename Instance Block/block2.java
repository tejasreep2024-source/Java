class parentcls{
    {
        System.out.println("Instance Block 1");
    }
}
public class block2 extends parentcls{
    {
        System.out.println("Instance Block 2");
    }
    public static void main(String[] args) {
     block2 t = new block2();
       
    }
}
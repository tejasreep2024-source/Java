// static block =>are those blocks used to write logics 
         //  static block excutes at the time of class loading  
         // no objects created 
class parecls{
    {
        System.out.println("Instance Block - Parent");
    }
    static{
     System.out.println("static block - child ");
    }
}
public class block3 extends parecls{
    {
        System.out.println("Instance Block-child");
    }
    static{
      System.out.println("static block - child");
    }
}

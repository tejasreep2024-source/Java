//..................thread life cycle......................................//
// 1> start-new
// 2>
 public class Demo3 extends Thread {

  public void run(){
    try{
     System.out.println("Tread start");
     Thread.sleep(3000);
     System.out.println("Thread end");
  }catch(Exception e){
    System.out.println(e);

  }
  }
  public static void main(String args[]){
        Demo3 d= new Demo3();
        d.start();
  }
}
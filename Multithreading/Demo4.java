//..................thread life cycle......................................//
// 1> start-new
// 2> Runnable
 public class Demo4 extends Thread {

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
        Demo4 d= new Demo4();
        System.out.println(Thread.currentThread().getName());
        d.start();
        System.out.println(d.getName());
  }
}
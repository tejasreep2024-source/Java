//..................thread life cycle......................................//
// 1> start-new
// 2> Runnable
// 3> Running
 public class Demo5 extends Thread {

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
        Demo5 d= new Demo5();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Coder");
        System.out.println(Thread.currentThread().getName());
        d.start();
        System.out.println(d.getName());
        d.setName("Task1");
        System.out.println(d.getName());
  }
}
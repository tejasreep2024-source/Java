class Demo6 extends Thread{

  public void run(){
    try{
      for(int i = 0 ;i<10 ;i++){
        System.out.println(i);
      }
      Thread.sleep(5000);
      System.out.println("***********************");
    }
     catch(Exception e){
    System.out.println(e);


    }
  }

  public static void main(String args[]) throws InterruptedException{
        Demo6 d = new Demo6();
        d.start();
        d.join();
        System.out.println("last task completed.....");
  }
}
class Demo2 implements Runnable{
    public void run(){
        System.out.println("Runnable Interface ");
    }
    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        Thread t = new Thread(obj);
          t.start();
    }
}

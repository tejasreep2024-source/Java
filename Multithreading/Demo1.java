class Demo1 extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
    Demo1 d = new Demo1();
    d.start();   
    } 
    
}


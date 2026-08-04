// // methos of objects in java
// // methods of threads
// //Thread Methods =>
// //1.Wait() => Wait Method is used to hold further execution of any thread.

// //2.notify() => notify method is used to update the waiting threads for further execution.

// //3.notifyAll() => notifyAll method is used to update the multiple threads for further execution.

// class Customer {

//     synchronized void eat() {
//         System.out.println("Customer is waiting for food");

//         try {
//             wait(); // Customer waits
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Customer is enjoying the food");
//     }

//     synchronized void foodPrepare() {
//         System.out.println("Chef is preparing food");

//         notify(); // Wake up waiting customer
//     }
// }

// public class Demo8 {
//     public static void main(String[] args) {

//         Customer c = new Customer();

//         Thread t = new Thread(() -> c.eat());

//         Thread t1 = new Thread(() -> {
//             try {
//                 Thread.sleep(3000); // Simulate cooking time
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//             c.foodPrepare();
//         });

//         t.start();
//         t1.start();
//     }
// }
// =========================================================================
// notifyall()
class Customer {

    synchronized void eat() {
        System.out.println(Thread.currentThread().getName() + "Customer is waiting for food");

        try {
            wait(); // Customer waits
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() +"Customer is enjoying the food");
    }

            synchronized void foodPrepare() {
        System.out.println("Chef is preparing food");

        notify(); // Wake up waiting customer
    }
}

public class Demo8 {
    public static void main(String[] args) {

        Customer c = new Customer();

        Thread t = new Thread(() -> c.eat());

         Thread t0 = new Thread(() -> c.eat());

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000); // Simulate cooking time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c.foodPrepare();
        });

        t.start();
        t1.start();
    }
}
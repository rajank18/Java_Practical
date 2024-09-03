public class prac31 {

    
    static class demo extends Thread {
        public void run() {
            System.out.println("Hello from Thread class");
        }
    }

   
    static class demo1 implements Runnable {
        public void run() {
            System.out.println("Hello from Runnable interface");
        }
    }

    public static void main(String[] args) {
        
        demo thread1 = new demo();
        thread1.start(); 

      
        demo1 runnable = new demo1();
        Thread thread2 = new Thread(runnable);
        thread2.start(); 
    }
}

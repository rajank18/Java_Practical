public class prac31 {

    // Method A: By Extending the Thread Class
    static class HelloWorldThread extends Thread {
        public void run() {
            System.out.println("Hello from Thread class");
        }
    }

    // Method B: By Implementing the Runnable Interface
    static class HelloWorldRunnable implements Runnable {
        public void run() {
            System.out.println("Hello from Runnable interface");
        }
    }

    public static void main(String[] args) {
        // Creating and starting a thread by extending Thread class
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();  // Starts the thread, which calls the run() method of HelloWorldThread

        // Creating and starting a thread by implementing Runnable interface
        HelloWorldRunnable runnable = new HelloWorldRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();  // Starts the thread, which calls the run() method of HelloWorldRunnable
    }
}

public class prac35 {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1("FIRST");
        t1.setPriority(3);
        t1.start();
        Thread1 t2 = new Thread1("SECOND");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread1 t3 = new Thread1("THIRD");
        t3.setPriority(7);
        t3.start();
       

    }
}

class Thread1 extends Thread {

    public Thread1(String name) {
        super(name);

    }

    public void run() {

        for (int i = 0; i < 10; i++) {

            Thread currentThread = Thread.currentThread();
            System.out.println("Call no " + this.getName() + currentThread.getPriority());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

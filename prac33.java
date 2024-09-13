import java.util.Random;

public class prac33 {

    public static void main(String[] args) {

        Thread1 t = new Thread1();
        t.start();

    }
}

class Thread1 extends Thread {


    @Override
    public void run() {  

        Random r = new Random();
        int x = r.nextInt(90) + 10;

        System.out.println("Random Number is " + x);

        if (x % 2 == 0) {
            Thread2 t2 = new Thread2(x);
            t2.start();
        }
        if (x % 2 != 0) {
            Thread3 t3 = new Thread3(x);
            t3.start();
        }

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

class Thread2 extends Thread {

    int a;


    public Thread2(int z) {
        a = z;

    }

    @Override

    public void run() {
        int t2 = a * a;
        System.out.println("Square of the number is: " + t2);
    }

}

class Thread3 extends Thread {

    int a;


    public Thread3(int y) {
        a = y;

    }

    @Override

    public void run() {
        int t3 = a * a * a;
        System.out.println("Cube of the number is: " + t3);
    }

}

public class prac34 {

    static int value = 0;

    public static void main(String[] args) {

        Threads t = new Threads();
        t.start();

    }
}

class Threads extends Thread{

    @Override

    public void run(){
        int a =10;
        System.out.println("Before Increament: " + a);

        try {
            sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();;
        }
        a++;
        System.out.println("After Increament: " + a);
    }

}

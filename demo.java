public class demo {

    public static void main(String[] args) {
        thread t = new thread();
        t.start();
        thread t2 = new thread();
        t2.start();

        for(int i=0;i<4;i++){
            System.out.println("main ");
        }


    }
    
}

// class thread extends Thread {
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("thread");
//         }
//     }
// }


class thread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("call no:"+ i);
        }

        try {
            sleep(1000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


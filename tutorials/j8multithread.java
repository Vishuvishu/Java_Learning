
class thread1 extends Thread {

    public void run() {
        System.out.println("thread 1 running");
    }

}

class thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("thread 2 running");
    }

}

public class j8multithread {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th1.start();
        th2.run();

        Thread th = new Thread(th2);
        th.start();
    }
}

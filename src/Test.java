
public class Test {
    public static void main(String[] args) throws InterruptedException {

//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println(" 12352363");
//        MyThread2 myThread2 = new MyThread2();
//        myThread2.start();
//        System.out.println("a am sleep");
//        Thread.sleep(3000);
//        System.out.println("a am awake");
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + 10);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + 1000);
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);

        }
    }
}
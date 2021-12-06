

public class Test {
    public static void main(String[] args) throws InterruptedException {
        myThread myThread= new myThread();
        myThread.start();
        myThread myThread1=new myThread();
        myThread1.start();
        for (int i=0; i<10;i++){
            System.out.println("ggggg");
        }
        System.out.println("1235465465465464");
        Thread.sleep(1000);
        System.out.println("999999999999999999999999");

        Thread thread123 = new Thread(new Runner());
        thread123.start();

    }

}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("14352345234532452345 "+i+ " " +this);
        }

    }
}


class myThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello "+i+ " " +this);
        }
    }
}


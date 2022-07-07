package concurrency;

public class MainClass {

    public static void main(String[] args) {

        MainClass mc = new MainClass();

        Thread t1 = new Thread(()->{
            try {
                mc.printOdd();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(()->{
            try {
                mc.printEven();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();

    }

    public synchronized void printOdd() throws InterruptedException {
        for(int i=1;i<50;i=i+2){

            System.out.println("odd :"+i);
            wait();
            notify();

        }

    }

    public synchronized void printEven() throws InterruptedException {
        for(int i=2;i<50;i=i+2){

            System.out.println("even :"+i);

            notify();
            wait();
        }

    }
}

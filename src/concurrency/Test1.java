package concurrency;

public class Test1 {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            for(int i=0;i<100;i++) {
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
            }
        });

        System.out.println(Thread.currentThread().getName());

        t1.start();

        System.out.println(Thread.currentThread().getName());
    }
}

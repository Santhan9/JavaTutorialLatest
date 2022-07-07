package concurrency;

public class Newlient {

    public static void main(String[] args) throws InterruptedException {

        Server s = new Server();

        Thread user1 = new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName());

                try {
                    s.register("user"+i,"user"+i+"@gmail.com","test"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            s.notifyAll();

        });

        Thread user2 = new Thread(()->{
            for(int i=0;i<100;i++){
                System.out.println(Thread.currentThread().getName());

                try {
                    s.login("user"+i,"test"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        user1.start();

        user2.start();


    }
}

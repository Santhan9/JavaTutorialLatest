package concurrency;

public class Client  {

   /* public static void main(String[] args) {

        Server s = new Server();

        Thread user1 = new Thread(()->{
            try {
                s.register("user1","user1@gmail.com","test1");

            for(int i=0;i<10000;i++)
            s.login("user1","test1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread user2 = new Thread(()->{
            s.register("user2","user2@gmail.com","test2");
            for(int i=0;i<10000;i++)
            s.login("user2","test2");
        });

        Thread user3 = new Thread(()->{
            s.register("user3","user3@gmail.com","test3");

            for(int i=0;i<10000;i++)
            s.login("user3","test3");
        });

        Thread user4 = new Thread(()->{
            s.register("user4","user4@gmail.com","test4");
            for(int i=0;i<10000;i++)
            s.login("user4","test4");
        });
        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }*/


}

package concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    Map<String,String> loginMap = new ConcurrentHashMap<>();

    Map<String,String> registerMap = new ConcurrentHashMap<>();

    public synchronized void login (String userName , String password) throws InterruptedException {
        wait();
        System.out.println("login "+userName);
        if(loginMap.get(userName).equals(password)){
            System.out.println("Welcome to the world of programming");
            System.out.println(userName+" your email is "+ registerMap.get(userName));
        }else{
            System.out.println("login error");
        }



    }

    public synchronized void register(String userName ,String email,String password) throws InterruptedException {



        System.out.println("register "+userName);
        registerMap.put(userName,email);
        loginMap.put(userName,password);

        notify();



    }
}

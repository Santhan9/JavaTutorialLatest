package lamda;

public class MainClass {

   static int k = 2;

    public static void main(String[] args) {

        int j= 6;

        k=18;

        LamdaTest lt = new LamdaTest();


        System.out.println( lt.great((a)->{
           return a+k>16;
        },7));

    }
}

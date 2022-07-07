package singleton;

public class Test {

    public static void main(String[] args) {

        System.out.println(SingleObject.getInstance());

        System.out.println(SingleObject.getInstance());

        System.out.println(SingleObject.getInstance());

        System.out.println(EagerSingleton.getInstance());

    }
}

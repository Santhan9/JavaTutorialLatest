package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOError;

public class ClassB extends ClassA{

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj .test(1);
    }



    public void method1()  {

    }

    public void test(String val){
        System.out.println(" String value "+val);
    }

    public void test(Integer val){
        System.out.println("Integer value "+val);
    }
}

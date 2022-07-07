package Collection;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        List<String> ls1 = Arrays.asList("test1","test2","test3");



        //ls1.remove(2);

        System.out.println(ls1);

        List<String> ls2 = new ArrayList<>(ls1);

        ls2.add(2,"test4");

        ls2.set(0,"test5");

        for(String s:ls2){
            System.out.println(s);
            ls2.remove("test2");
        }



        //ls2.clear();

        System.out.println(ls2.equals(ls1));



        //ls2.sort(String::compareTo);

       // Collections.rotate(ls2,1);

        //ListTest.shuffle(ls2);

        //Collections.shuffle(ls2);

ls2.forEach(System.out::println);

    }


    public static <E> List<E> shuffle(List<E> l){
        Random rn = new Random();
        for(int i=l.size();i>1;i--){
            swap(l,i-1,rn.nextInt(i));
        }
        return  l;
    }

    public static <E> void swap(List<E> l , int i,int j){

        E temp = l.get(i);
        l.set(i,l.get(j));
        l.set(j,temp);


    }
}

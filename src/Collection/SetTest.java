package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class SetTest {

    public static void main(String[] args) {


        List<String> ls1 = Arrays.asList("test15", "test2", "test3","test1");

        Collection<String> sc = new HashSet<>(ls1);

        System.out.println(sc);

     Collection<String> tc =   ls1.stream().collect(Collectors.toCollection(HashSet::new));

        //System.out.println(sc.add("test1"));

        Iterator i = tc.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}

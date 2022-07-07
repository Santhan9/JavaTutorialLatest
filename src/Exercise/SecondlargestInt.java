package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondlargestInt {

    public static void main(String[] args) {
        int[] a = {5,43,7,65,74,23};

      //Arrays.stream(a).sorted().collect(Collectors.toCollection(ArrayList::new))

     int k = a.length-2;

        System.out.println(a[k]);

        List<Integer> li  =  Arrays.stream(a).boxed().collect(Collectors.toCollection(ArrayList::new));

      //li.forEach(System.out::println);

      li.sort(Comparator.reverseOrder());

        System.out.println(li.get(1));


    }
}

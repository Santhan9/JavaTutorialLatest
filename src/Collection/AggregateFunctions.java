package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateFunctions {

    public static void main(String[] args) {

        Integer k=10,y=10;

        System.out.println(k==y);


        List<Integer> li = Arrays.asList(5, 7, 8, 3, 2, 10);

        System.out.println(li.stream().reduce(0,(a,b)->a+b).intValue());

        int[] as ={1,2,3,4,5};

     int s=   Arrays.stream(as).sum();

        System.out.println(s);



        System.out.println(li.stream().reduce(0,(a,b)->{
            return a>b ? a:b;
        }).intValue());

    }

}

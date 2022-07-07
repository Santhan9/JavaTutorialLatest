package Exercise;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicates {

    public static void main(String[] args) {

        String s = "All is well";

    Map<Character,Integer> mc=    s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e->1)));

        System.out.println(mc.get('l'));


    }
}

package Exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {

    public static void main(String[] args) {
        String s = "All is well";

        Map<Character,Integer> mc = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e->1)));

        System.out.println(mc);

        List<Character> lc = s.chars().mapToObj(e->(char)e).collect(Collectors.toList());

        for(Character c :lc){
            if (mc.get(c) == null) {
                mc.put(c, 1);
            } else {
                mc.put(c, mc.get(c)+1);
            }
        }

        mc.entrySet().stream().sorted((e1,e2)->{
            return e2.getValue() - e1.getValue();
        }).forEach(System.out::println);

        //System.out.println(mc);
    }
}

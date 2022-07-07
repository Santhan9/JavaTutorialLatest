package Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupliates {
    public static void main(String[] args) {
        String s = "All is well";

     Set<Character> sc= s.chars().mapToObj(e->((char)e)).collect(Collectors.toCollection(LinkedHashSet::new));




    }
}

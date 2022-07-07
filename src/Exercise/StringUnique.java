package Exercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUnique {

    public static void main(String[] args) {
        String s = "All is well";

     List<Character> lc=   s.chars().mapToObj(e->(char)e).collect(Collectors.toCollection(ArrayList::new));



     Set<Character> sc = new HashSet<>();

     int dist=0;

     for(Character c : lc){
         if(sc.add(c)){
             dist++;
         }
     }

        System.out.println(dist);









    }
}

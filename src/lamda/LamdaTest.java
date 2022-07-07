package lamda;

import java.util.function.Predicate;

public class LamdaTest {

    public boolean great(Predicate<Integer> p,int a){

        return  p.test(a);

    }
}

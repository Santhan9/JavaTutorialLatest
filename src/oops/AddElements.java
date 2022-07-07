package oops;

public class AddElements implements Sumable {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public double add(double a, double b) {
        return a+b;
    }

    public int increment(int a){
      return  add(a);
    }
}

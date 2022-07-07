package oops;

public interface Sumable {

 int add(int a, int b) ;

 default int add(int a){
     return a++;
 }
}

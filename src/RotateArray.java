import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7};
        int k = 3;

        int temp =0;
        int last = a.length-1;

        for(int i=0;i<k;i++){
            temp=a[last];
            moveRight(a);
            a[0]=temp;


        }

        Arrays.stream(a).forEach(System.out::print);



    }

   static void moveRight(int[] a){
        for(int i = a.length-1;i>=1;i--){
            a[i]=a[i-1];
        }
    }


    }


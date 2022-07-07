package Exercise;

public class StringReverse {
    public static void main(String[] args) {
        String s = "San@#than@#";

        char[] cs = s.toCharArray();

        int i = 0;

        int j = cs.length - 1;

        while (i < j) {
            if(Character.isLetter(cs[i])) {
                if(Character.isLetter(cs[j])) {
                    swap(cs,i,j);
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else {
                i++;
            }

        }

        String result = new String(cs);
        System.out.println("result "+result);

    }

    static   void swap(char[] c, int a,int b){

        char temp =c[a];
        c[a]=c[b];
        c[b]=temp;


    }
}

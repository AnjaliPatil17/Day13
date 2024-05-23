public class FindMaximum {
    public static <T extends Comparable<T>> T findMax(T a, T b,T c) {
     T max=a;
     if(b.compareTo(max)>0){
         max=b;
     }if(c.compareTo(max)>0){
            max=c;
        }
     return max;
    }

    public static void main(String[] args) {

        System.out.println("Maximum in Integer array: " + findMax(4,6,9));
        System.out.println("Maximum in Float array: " + findMax(2.5f,5.6f,4.9f));
        System.out.println("Maximum in String array: " + findMax("apple","orange","lichi"));
    }
}
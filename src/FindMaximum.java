public class FindMaximum {
    public static void max(int a,int b,int c){
        System.out.println("The Integer Numbers are: "+a+","+b+","+c);
        if(a > b && a > c){
            System.out.println("Maximum number is: "+ a);
        }else if (b > a && b > c) {
            System.out.println("Maximum number is: "+ b);
        }else {
            System.out.println("Maximum number is: "+ c);
        }
    }
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=9;
        max(a,b,c);
    }
}

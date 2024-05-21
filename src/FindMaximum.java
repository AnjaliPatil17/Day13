public class FindMaximum {
    public static void max(float a,float b,float c){
        System.out.println("The Float Numbers are: "+a+","+b+","+c);
        if(a > b && a > c){
            System.out.println("Maximum number is: "+ a);
        }else if (b > a && b > c) {
            System.out.println("Maximum number is: "+ b);
        }else {
            System.out.println("Maximum number is: "+ c);
        }
    }
    public static void main(String[] args) {
        float a=5.0f;
        float b=8.0f;
        float c=3.0f;
        max(a,b,c);
    }
}



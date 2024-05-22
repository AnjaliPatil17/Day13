public class FindMaximum {
    public static void max(String a,String b,String c){
        System.out.println("The Strings  are: "+a+","+b+","+c);
        if(a.length() > b.length()  && a.length() > c.length()){
            System.out.println("Maximum String is: "+ a);
        }else if (b.length() > a.length()&& b.length() > c.length()) {
            System.out.println("Maximum String is: "+ b);
        }else {
            System.out.println("Maximum String is: "+ c);
        }
    }
    public static void main(String[] args) {
        String a="Apple";
        String b="banana";
        String c="kiwi";
        max(a,b,c);
    }
}



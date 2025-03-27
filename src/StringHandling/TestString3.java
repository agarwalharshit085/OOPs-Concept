package StringHandling;

public class TestString3 {
    public static  void main(String[] args) {
//        String s1 = new String("Anuj");
//
//        s1.concat("Techy");
//
//        String s3 = s1.concat("Technical");
//        s1 = s1.concat("Point");
//        System.out.println(s1);
//        System.out.println(s3);


        String s1 = new String("anuj");
        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        String s5 = s4.toUpperCase();

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
    }
}

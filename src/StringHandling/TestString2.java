package StringHandling;

public class TestString2 {
    public static  void main(String[] args) {
        String s1 = new String("Anuj");
        String s2 = new String("Anuj");
        System.out.println(s1 == s2);
        s1 = s2;
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        StringBuffer s3 = new StringBuffer("Anuj");
        StringBuffer s4 = new StringBuffer("Anuj");
        System.out.println(s3 == s4);
//        s3 = s4;
        System.out.println(s3 == s4); // False Both the references are not pointing to the same object

        System.out.println(s3.equals(s4)); // False

    }
}

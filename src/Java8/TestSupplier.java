package Java8;

import java.util.Date;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {

        Supplier<String> supplier = ()-> {
            return "Harshit";
        };
        System.out.println(supplier.get());


        Supplier<Integer> supplier1 = ()-> {
            return 10;
        };
        System.out.println(supplier1.get());

        Supplier<Boolean> supplier2 = ()->
        {
            return "Harsh".length()>2;
        };
        System.out.println(supplier2.get());
        Supplier<Character> supplier3 = ()->
        {
            return 'H';
        };
        System.out.println(supplier3.get());

        Supplier<Date> s1 = ()->new Date();
        System.out.println(s1.get());
    }
}

package Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {

        Function<Integer, Integer> function = (p) -> p * 2;
        System.out.println(function.apply(51));  // Output: 102

        BiFunction<String, String, String> biFunction = (p, q) -> p + " " + q;
        System.out.println(biFunction.apply("Anuj", "Sharma"));  // Output: Anuj Sharma

        BiFunction<Integer, Integer, Integer> biFunction1 = Integer::sum;
        System.out.println(biFunction1.apply(10, 15));  // Output: 25

        BiFunction<Integer, Integer, String> biFunction2 = (p, q) -> Character.toString((char) Math.max(p, q));
        System.out.println(biFunction2.apply(65, 66));  // Output: B

        Function<String , Boolean> function2 = (a) -> {
            return a.length() > 2;
        };

        System.out.println(function2.apply("Harshit"));

        BiFunction<Integer, Integer, Integer> biFunction3 = (a,b)-> {
            return a - b;};
        System.out.println(biFunction3.apply(10, 15));

        BiFunction<Integer, Integer, Boolean> biFunction4 = (a,b)-> {
            return a == b;};
        System.out.println(biFunction4.apply(10, 15));
        BiFunction<String , String , Integer> biFunction5 = (a,b)-> {
            return a.length() + b.length();};
        System.out.println(biFunction5.apply("Harshit", "Agrawal"));
    }
}

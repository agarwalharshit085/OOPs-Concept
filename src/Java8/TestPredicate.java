package Java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {

        Predicate<Integer> predicate = (n) -> n % 2 == 0;
        System.out.println(predicate.test(15));

        Predicate<Integer> predicate1 = (n) -> n >2;
        System.out.println(predicate.test(12));

        BiPredicate<String,String> biPredicate = (str1 , str2)-> str1.equalsIgnoreCase(str2);
        System.out.println(biPredicate.test("Harshit","harshit"));

//        BiPredicate<Integer,Integer> biPredicate1 = (a , b)-> a>b;
//        System.out.println(biPredicate1.test(15,20));

        Predicate<String > predicate2 = (n) -> n.isEmpty();
        System.out.println(predicate2.test("Harshit"));

        BiPredicate<Integer,Integer> biPredicate1 =(a,b)-> a == b;
        System.out.println(biPredicate1.test(10, 10));

        BiPredicate<Boolean,Boolean> biPredicate2 =(a,b)-> a == b;
        System.out.println(biPredicate2.test(true, false));

    }
}


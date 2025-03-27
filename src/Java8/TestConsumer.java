package Java8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {

        Consumer<String> c1 = (msg) -> System.out.println("Anuj" + msg);
        c1.accept(" How are you ?");

        BiConsumer<Integer, Integer> c2 = (a, b) -> System.out.println(a + b);
        c2.accept(10, 15);

        Consumer<String> c3 = (msg) -> System.out.println("Harshit" + msg);
        c3.accept(" Agrawal");

        BiConsumer<Integer, Integer> c4 = (a, b) -> System.out.println(a * b);
        c4.accept(10, 15);

        BiConsumer<String , Boolean> c5 = (a, b) -> System.out.println(a.isEmpty());
        c5.accept("Harsh", true);

    }
}

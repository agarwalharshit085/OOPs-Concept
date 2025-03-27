package Java8.TestStreamAPIs;

import java.util.Arrays;
import java.util.List;


public class TestStream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        list.stream().forEach(c->System.out.println(c)); // method chaining

        int sum = list.stream().mapToInt(n->n).sum();
        System.out.println(sum);
//        list.stream().forEach(System.out::println); // method chaining
    }
}

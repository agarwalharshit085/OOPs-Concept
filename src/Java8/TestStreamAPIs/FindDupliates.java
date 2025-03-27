package Java8.TestStreamAPIs;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
public class FindDupliates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12, 3, 45, 5, 3, 12, 56);
        HashSet<Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);

    }
}

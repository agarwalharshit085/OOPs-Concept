package Java8.TestStreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,23);

        Stream<Integer> opStream1 = list.stream().filter((Integer i)-> i %2 != 0);
        Stream<Integer> opStream2 = list.stream().filter((Integer i)-> i > 10);

        List<Integer> result1 = opStream1.collect(Collectors.toList());
        List<Integer> result2 = opStream2.collect(Collectors.toList());

//        result2.stream().forEach(System.out::println);
//        result1.stream().forEach(System.out::println);

        Stream<Integer> opStream3 = list.stream().map((Integer i)-> i + 1).limit(10);
        List<Integer> result3 = opStream3.collect(Collectors.toList());

        result3.stream().forEach(System.out::println);


    }
}

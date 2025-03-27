import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9, 7, 10);
        l.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 10)
                .forEach(System.out::println); // No output because no even numbers > 10 in the list

        StreamFilter sf = new StreamFilter();
        sf.printEven(15);
    }

    public void printEven(int range) {
        int[] arr = new int[range];
        for (int i = 0; i < range; i++) {
            arr[i] = i;
        }

        List<Integer> integerList = IntStream.of(arr).boxed().toList();
        integerList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}


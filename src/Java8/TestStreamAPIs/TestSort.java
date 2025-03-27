package Java8.TestStreamAPIs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestSort {
    public static void main(String[] args) {

        int[] arr = {20, 10, 30, 40, 50};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
        int[] result_asc = Arrays.stream(arr).sorted().toArray();
        for(int i : result_asc)
        {
            System.out.println(i);
        }
        System.out.println();
        List<Integer> result_desc = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        for(int i : result_desc)
        {
            System.out.println(i);
        }

    }
}

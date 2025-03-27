package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args){

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1 % 10 > o2 % 10)
                    return -1;
                else
                    return 1;
            }
        };
        List<Integer> nums = Arrays.asList(22, 43, 31, 72, 29);
        Collections.sort(nums, com);
        System.out.println("List after sorting on the basis of last digit : " + nums);
    }
}

package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IntComparator implements Comparator<Integer>
{
    public int compare(Integer a, Integer b)
    {
        return a.compareTo(b);
    }
}
public class TestComparator2 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(123, 107, 131, 137, 13);
        System.out.println("Before Sorting : " + list);

        Collections.sort(list, new IntComparator());
        System.out.println("Ascending order : " + list);
        System.out.println("Descending order : " + list.reversed());

    }
}

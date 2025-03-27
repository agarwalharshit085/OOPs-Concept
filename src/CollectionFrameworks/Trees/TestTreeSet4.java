package CollectionFrameworks.Trees;

import java.util.*;

public class TestTreeSet4 {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(55, 76, 7, 89, 35, 55);
        TreeSet<Integer> treeSet = new TreeSet<>(list);

        System.out.println(treeSet);
        System.out.println(treeSet.reversed());

        TreeSet<Integer> treeSet1 = new TreeSet<>(Comparator.reverseOrder());
        treeSet1.addAll(list);
        System.out.println(treeSet1);
    }
}

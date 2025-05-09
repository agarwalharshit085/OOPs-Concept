package CollectionFrameworks.Trees;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;

        if(i1 < i2)
            return 1;
        else if (i1 > i2)
            return -1;
        else
            return 0;
    }
}
public class TestTreeSet3 {
    public static void main(String[] args) {

        MyComparator m1 = new MyComparator();
        TreeSet<Integer> set = new TreeSet<>(m1);
        set.add(56);
        set.add(61);
        set.add(16);
        set.add(65);
        set.add(45);
        set.add(34);

        System.out.println(set);
    }
}

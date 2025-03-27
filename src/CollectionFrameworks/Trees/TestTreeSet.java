package CollectionFrameworks.Trees;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args)
    {
        Set set = new TreeSet();
        set.add("Z");
        set.add("A");
        set.add("Y");
        set.add("B");
        set.add("a");
//        set.add(10);   // Gives ClassCastException
//        set.add(null); // give null pointer exception
        System.out.println(set);

    }
}

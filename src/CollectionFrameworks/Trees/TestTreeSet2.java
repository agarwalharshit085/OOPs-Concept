package CollectionFrameworks.Trees;

import java.util.TreeSet;

public class TestTreeSet2 {

    public static void main(String[] args)
    {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(101);
        set.add(103);
        set.add(105);
        set.add(107);
        set.add(109);
        set.add(112);

        System.out.println(set.first());  // return the first element from the tree set
        System.out.println(set.last());  // return the last element from the tree set
        System.out.println(set.subSet(101,107));  // return all the elements between the range excluding the last limit
        System.out.println(set.headSet(105));   // return all the elements before the specified element excluding the element
        System.out.println(set.tailSet(105));  // returns all the elements after the specified element including the element

    }
}

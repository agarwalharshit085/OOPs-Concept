package CollectionFrameworks.List;

import java.util.LinkedList;

public class TestLinkedList {

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();

//        System.out.println(list instanceof Serializable);
//        System.out.println(list instanceof Cloneable);
//
//        System.out.println(list instanceof RandomAccess);

        list.add(10);
        list.add(20);
        System.out.println(list);
    }
}

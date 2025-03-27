package CollectionFrameworks.List;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list1.add(i * 10);
        }
        list1.add(null);
        list1.add(null);

        System.out.println(list1);
        list1.add(1, "Harshit");  // it shifts then insert the new element
        System.out.println(list1);
        list1.set(1,"Anuj");  //  It removs the previous elements than adds the new one
        System.out.println(list1);

        ArrayList list2 = new ArrayList();
        for (int i = 11; i <= 20; i++) {
            list2.add(i);
        }
        list1.addAll(list2);
//        System.out.println(list1);

        Iterator it = list1.iterator();  // factory design pattern
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        ArrayList list3 = new ArrayList<>();
        list3.add(40);
        list3.add(45);
        System.out.println(list1.containsAll(list3));
//        System.out.println(list1.contains(11));
//        printList(list);
//        list.remove(6);
//        printList(list);

//        list.removeAll(list);
//        printList(list);
//        System.out.println(list.get(5));  // returns the element at the 5th index
//        list.toString(); // converts the arraylist to String
//        printList(list);


    }
}

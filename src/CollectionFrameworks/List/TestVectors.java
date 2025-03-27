package CollectionFrameworks.List;

import java.util.Iterator;
import java.util.Vector;

public class TestVectors {

    public static void main(String[] args) {
        Vector vector1 = new Vector<>();

        System.out.println("Initial capacity : " + vector1.capacity());
        for (int i = 1; i <= 10; i++) {
            vector1.add(i * 10);
        }
        vector1.add(null);
        vector1.add(null);

//        System.out.println(vector1);
        vector1.add(1, "Harshit");  // it shifts then insert the new element
//        System.out.println(vector1);
        vector1.set(1,"Anuj");  //  It removs the previous elements than adds the new one
//        System.out.println(vector1);

        Vector vector2 = new Vector();
        for (int i = 11; i <= 20; i++) {
            vector2.add(i);
        }
        vector1.addAll(vector2);
//        System.out.println(vector1);

        Iterator it = vector1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Last capacity : " + vector1.capacity());
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

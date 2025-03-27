package CollectionFrameworks.HashMapPlusSet;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHS {
    public static void main(String[] args)
    {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 1; i <= 10; i++)
        {
            set.add(i * 10);
        }
        System.out.println(set.add(50));
        set.add(null);
//        System.out.println(set);
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }

    }
}

package CollectionFrameworks.HashMapPlusSet;

import java.util.*;

public class TestHashMap {

    public static void main(String[] args)
    {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"Sparsh");
        hashMap.put(2,"Dev");
        hashMap.put(3,"Amit");
        hashMap.put(4,"Harshit");

        for(Map.Entry<Integer, String> map : hashMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
        System.out.println();
        Set set = hashMap.entrySet();

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

package Sorting;

import java.util.Comparator;
import java.util.TreeMap;

class MyComparator implements Comparator<String>
{
    @Override
    public int compare(String a, String b) {

        return a.compareTo(b);
    }
}
public class TestTreeMap {

    public static void main(String[] args)
    {
        TreeMap treeMap = new TreeMap<>(new MyComparator());

        treeMap.put("Harshit",1);
        treeMap.put("Sparsh",2);
        treeMap.put("Amit",3);
        treeMap.put("Dev",4);
        treeMap.put("Nancy",5);
        treeMap.put("Sahil",6);

        System.out.println(treeMap);
    }
}

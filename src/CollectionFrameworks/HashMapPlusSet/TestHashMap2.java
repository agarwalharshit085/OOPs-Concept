package CollectionFrameworks.HashMapPlusSet;

import java.util.HashMap;

public class TestHashMap2 {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        System.out.println(hashMap.put("Anurag", 78000));
        System.out.println(hashMap.put("Anurag", 88000));
        System.out.println(hashMap.put("null", 68000));

        System.out.println(hashMap.entrySet());

    }
}

package HashTable;

import java.util.Hashtable;

class Temp {
    int i;

    Temp(int i) {
        this.i = i;
    }
    @Override
    public int hashCode() {
        return i;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Temp temp = (Temp) obj;
//        return i == temp.i;
//    }
    @Override
    public String toString() {
        return String.valueOf(i);
    }
}

public class TestHashing {
    public static void main(String[] args) {
        Hashtable<Temp, String> h = new Hashtable<>();

        h.put(new Temp(11), "One");
        h.put(new Temp(12), "Two");
        h.put(new Temp(13), "Three");
        h.put(new Temp(14), "Four");
        h.put(new Temp(25), "Five");
        System.out.println(h);

        h.put(new Temp(3), "Six");

        System.out.println(h);
    }
}

package CollectionFrameworks.Trees;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TestTreeSet5 {
    public static void main(String[] args){

        List<String> list = Arrays.asList("Sunil", "Kashish","Mudit","Amit", "Junaid","Rafiq");

        TreeSet<String> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);
        System.out.println(treeSet.reversed());
    }
}

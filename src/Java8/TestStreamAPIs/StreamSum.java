import java.util.Arrays;

public class StreamSum {
    public static void main(String[] args) {

        int[] arr = {20,10,30,40,50};
        int s = Arrays.stream(arr).sum();
        System.out.println(s);
    }
}

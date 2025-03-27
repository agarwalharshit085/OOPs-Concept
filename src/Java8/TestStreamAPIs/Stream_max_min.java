import java.util.Arrays;
import java.util.OptionalInt;

public class Stream_max_min {
    public static void main(String args[])
    {
        int[] arr = {20,10,30,40,50};
        int maximum = Arrays.stream(arr).max().getAsInt();
        int minimum = Arrays.stream(arr).min().getAsInt();
        System.out.println(maximum + " & " + minimum);
    }
}

import java.util.Arrays;

import static java.util.Arrays.*;

public class Stream_Avg {
    public static void main(String[] args)
    {
        int[] arr = {20,10,30,40,50};
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}

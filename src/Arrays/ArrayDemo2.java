package Arrays;

public class ArrayDemo2 {

    public static void main(String[] args)
    {
        int i = 5;
        int sum = 0;
        while(i <= 10)
        {
            sum += i;
            System.out.println(i++);
        }
        System.out.println("Sum is :"+ sum);
    }
}

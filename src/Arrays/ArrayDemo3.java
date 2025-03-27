package Arrays;

public class ArrayDemo3 {
    public static void main(String[] args)
    {
        int a[] = { 67, 97, 4, 8, 56, 7};
        int min = a[0];
        int max = a[0];

        for(int i : a)
        {
            if(i < min)
            {
                min = i;
            }
            if(i > max)
            {
                max = i;
            }

        }

        System.out.println("Smallest : "+ min);
        System.out.println("Largest : "+ max);

    }
}

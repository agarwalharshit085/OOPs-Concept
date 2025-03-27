package Arrays;


import java.util.Scanner;

public class ArrayFunction {
    public static int maxElement(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minElement(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements : ");
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element is : " + maxElement(arr));
        System.out.println("Smallest element is : " + minElement(arr));

    }
}

package Arrays;

import java.util.Scanner;

public class ArrayReturn {
    public static int[] arrayCopy(int[] arr)
    {
        int left = 0, right = arr.length - 1;
        int []num = new int[arr.length];
        while(left < right) {
            num[left] = arr[left];
            num[right] = arr[right];
            left++;
            right--;
        }
        return num;
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
        int ans[] = arrayCopy(arr);
        System.out.println("After copying the array ");
        for(int i = 0; i < ans.length; i++)
        {
            System.out.println(ans[i]);
        }

    }
}

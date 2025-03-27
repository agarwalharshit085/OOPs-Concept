package Arrays;

import java.util.Scanner;

public class EvenOdd {
    public static int[] evenOdd(int[] arr)
    {
        int left = 0, right = arr.length - 1;
        int []num = new int[arr.length];

        for (int j : arr) {
            if (j % 2 == 0) {
                num[left] = j;
                left++;
            } else {
                num[right] = j;
                right--;
            }
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
        int[] ans = evenOdd(arr);
        System.out.println("After copying the array ");
        for (int a : ans) {
            System.out.print(a + " ");
        }

    }
}

package MultidimensionalArray;

import java.util.Scanner;

public class Test2DArray {

    public static void printArray(int[][] arr, int row, int col)
    {
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of the array : ");
        int row  = sc.nextInt(), col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter values of the array : ");
        for (int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr, row ,col);
    }
}

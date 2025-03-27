package Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        int i = 0;

        System.out.println("Using while loop");
        int sum = 0;
        while(i < a.length)
        {
            sum += a[i];

            System.out.println(a[i]);
            i++;

        }
        System.out.println("Suum is : "+ sum);
        System.out.println("Average is : "+ sum / 5);

        System.out.println("For each or enhanced for loop ");
        for(int b : a)
        {
            System.out.println(b);
        }
        System.out.println("Using for loop");
        for(i =0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("using do while");
        int c = 0;
        do{
            System.out.println(a[c]);
            c++;
        } while(c < a.length);
    }
}

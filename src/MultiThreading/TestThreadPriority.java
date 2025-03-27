package MultiThreading;

class MyThread4 extends Thread
{
    public void run()
    {
        System.out.println("Inside Child Thread");
    }
}
public class TestThreadPriority {

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());

        MyThread4 myThread4 = new MyThread4();
        myThread4.start();
        System.out.println(myThread4.getPriority());

    }
}

package MultiThreading;

class MyThread2 extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++) {
            System.out.println("Child Thread !!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class TestThread2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Parent Thread ");
            Thread.sleep(2000);
        }
    }
}

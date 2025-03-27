package MultiThreading;

class MyThread extends Thread{
     public void run(){
        System.out.println("This is my Job");
         for(int i = 0; i < 5; i++)
         {
             System.out.println("World");
         }
    }
}

public class TestMultiThreading {
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        System.out.println("Get the current Thread : " + Thread.currentThread().getName());
        // this is internally calling the start method
        myThread.start();
        myThread.setName("Harsh");
        System.out.println("Get name : " + myThread.getName());

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Hello");
        }
    }
}

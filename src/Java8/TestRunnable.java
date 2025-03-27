package Java8;

class MyThread implements Runnable
{
    public void run(){
        System.out.println("Inside the thread");
    }
}
public class TestRunnable {
    public static void main(String[] args) {

        Thread t = new Thread(new MyThread());
        t.start();

        Runnable r =  () -> System.out.println("Inside another thread");
        Thread t1 = new Thread(r);
        t1.start();
    }
}

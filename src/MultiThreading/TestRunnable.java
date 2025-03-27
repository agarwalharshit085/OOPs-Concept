package MultiThreading;

class ThreadRunnable implements Runnable {
    public void run() {
        System.out.println("Inside the TestRunnable Class");
    }
}
public class TestRunnable {

    public static void main(String[] args){

        Thread t = new Thread(new ThreadRunnable());
        t.start();
    }
}

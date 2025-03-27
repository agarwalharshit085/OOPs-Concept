package TestSynchronization;

class Greeting
{
    public synchronized void greet(String str) throws InterruptedException {
        for(int i = 0; i < 10; i++) {
            System.out.println("Happy Birthday day !! " + str);
            Thread.sleep(2000);
        }
    }
}
class TestThread extends Thread
{
    Greeting g;
    String name;

    public TestThread(String name, Greeting g)
    {
        this.name = name;
        this.g = g;

    }
    public void run() {
        try {
            g.greet(name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class TestSync1 {

    public static void main(String[] args) throws InterruptedException {

        TestThread harshitThread = new TestThread("Harshit", new Greeting());
        harshitThread.start();

        System.out.println(Thread.currentThread().getThreadGroup().getParent());
        TestThread devThread = new TestThread("Dev", new Greeting());
        devThread.start();
    }
}


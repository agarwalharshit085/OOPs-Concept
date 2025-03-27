package TestSynchronization;

import java.time.chrono.ThaiBuddhistChronology;

class Table
{
    public synchronized void printTable(int n) throws InterruptedException {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n * i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class TestThread1 extends Thread
{
    Table g;
    int n;

    public TestThread1(int n , Table g)
    {
        this.n = n;
        this.g = g;

    }
    public void run() {
        try {
            g.printTable(n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class TestTable {

    public static void main(String[] args) throws InterruptedException {


        Table t11 = new Table();
        Table t12 = new Table();
        TestThread1 testThread = new TestThread1(5, t11);
        testThread.start();

        TestThread1 testThread1 = new TestThread1(50, t12);
        testThread1.start();
    }
}

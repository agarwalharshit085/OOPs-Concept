package MultiThreading;

class Thread1 extends Thread
{
    // 3. Running state
    public void run()
    {
        String[] name = {"Abhisekh", "Firdous", "Deb","Aditya"};
        for(String i : name)
        {
            try {
                Thread1.sleep(500);
                System.out.println("Name : " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class TestThreadLife {
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1(); //  1.newborn state
        t1.start();                 //  2.Runnable state
    }
}

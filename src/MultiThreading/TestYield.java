package MultiThreading;

class Thread3 extends Thread
{
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Harshit Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//class Thread4 extends Thread
//{
//    public void run(){
//        for(int i = 0; i < 10; i++) {
//            System.out.println("Sparsh Thread");
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        Thread.yield();
//
//    }
//}
public class TestYield {
    public static void main(String[] a) throws InterruptedException {
        Thread3 thread3 = new Thread3();
        thread3.start();
        Thread.yield();

        for(int  i= 0; i < 10 ;i++)
            System.out.println("Hello dear");
//        Thread4 thread4 = new Thread4();
//        thread4.start();
    }
}

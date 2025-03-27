package Java8.MethodReference;

interface Sim1
{
    void calling();
}

class Jio{
    Jio(){
        System.out.println("Inside constructor.");
    }
    void calling()
    {
        System.out.println("Inside calling.");
    }
}
public class TestMRConstructor {
    public static void main(String[] args) {
//        Sim1 sim1 = Jio::new;
//        sim1.calling();
        Sim1 sim12 = new Jio()::calling;
        sim12.calling();

    }
}

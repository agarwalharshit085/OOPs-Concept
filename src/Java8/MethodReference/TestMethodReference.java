package Java8.MethodReference;

interface Sim
{
    void calling();
}

class Test{
    static void show(){
        System.out.println("Calling by static show");
    }
}
interface Car{
    void speed();
}

class Drive{
    void driveWithSpeed(){
        System.out.println("Driving with high speed.");
    }
}
public class TestMethodReference {
    public static void main(String[] args)
    {
//        Sim sim =()-> System.out.println("Inside calling");
        Sim s = Test::show;
        s.calling();

        Car c = new  Drive()::driveWithSpeed;

        c.speed();
    }
}

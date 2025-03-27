package Java8;

interface Sim{
    void simName(String name);
}

class Jio implements Sim{

    @Override
    public void simName(String name) {
        System.out.println("This is : " +name);
    }
}
class Airtel implements Sim{

    @Override
    public void simName(String name) {
        System.out.println("This is :"+name);
    }
}

public class TestFunctionalInterface {
    public static void main(String[] args) {
        Sim sim = new Jio();
//        sim.simName("JIO");
//        sim = new Airtel();
//        sim.simName("AIRTEL");

        sim = (String name)->{ System.out.println("This is :" + name);};
        sim.simName("JIO");
        sim = (String name)->{ System.out.println("This is :" + name);};
        sim.simName("AIRTEL");
    }
}

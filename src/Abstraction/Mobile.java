package Abstraction;

abstract class Sim{
    abstract void calling();
}

class Airtel extends  Sim{

    public void calling()
    {
        System.out.println("Airtel Sim");
    }
}
class Jio extends  Sim{

    public void calling()
    {
        System.out.println("Jio Sim");
    }
}
class Vodafone extends  Sim{

    public void calling()
    {
        System.out.println("Vodafone Sim");
    }
}
public class Mobile {
    public static void main(String[] args)
    {
        Sim sim = new Airtel();  //  we can change the object name so this is run time polymorphism
        sim.calling();

        sim = new Jio();
        sim.calling();

        sim  = new Vodafone();
        sim.calling();
    }
}

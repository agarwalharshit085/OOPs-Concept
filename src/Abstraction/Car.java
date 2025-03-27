package Abstraction;

abstract class TypeCar {
    abstract void category();

    void printMessage(){
        System.out.println("Check the car category");
    }
}

class Sedan extends TypeCar {
    void category(){
        System.out.println("This is a sedan ");
    }
}
class Xuv extends TypeCar {
    void category(){
        System.out.println("This is a Xuv ");
    }
}

public class Car
{
    public static void main(String[] args)
    {
        TypeCar type = new Xuv();
        type.category();
        type = new Sedan();
        type.category();

        type.printMessage();
    }
}


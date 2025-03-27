package Abstraction;

abstract class TypeDosa{
    abstract void dosaType();
}

class OnionDosa extends TypeDosa {
    void dosaType(){
        System.out.println("This is Onion dosa");
    }
}
class MasalaDosa extends TypeDosa {
    void dosaType(){
        System.out.println("This is Masala dosa");
    }

}

public class Dosa {
    public static void main(String[] args)
    {
        TypeDosa type = new MasalaDosa();
        type.dosaType();

        type = new OnionDosa();
        type.dosaType();
    }
}

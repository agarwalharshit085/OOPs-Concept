package Inheritance.TestMultiLevel;

class DadaJi{
    void gold(){
        System.out.println("Inside DadaJi class");
    }
}

class PapaJi extends DadaJi{
    void banglow(){
        System.out.println("Inside PapaJi class");
    }
}

class BetaJi extends PapaJi{
    void fatFati() {
        System.out.println("Inside BetaJi class");
    }
}
public class MultiLevelInheritance {
    public static void main(String args[]) {

        BetaJi betaJi = new BetaJi();
        betaJi.fatFati();
        betaJi.banglow();
        betaJi.gold();

        DadaJi dadaJi = new DadaJi();
        dadaJi.gold();
//      dadaJi.bunglow(); // parent class cannot access child class properties

        PapaJi papaJi = new PapaJi();
        papaJi.banglow();
        papaJi.gold();
//      papaJi.fatFati(); // parent class cannot access child class properties
    }
}

package Polymorphism.RunTimePolymorphism;

class Bauji{
    void drink(){
        System.out.println("Drinks Water");
    }
}
class Betuji extends Bauji{
    void drink(){ // if we try to change the access modifier of the method signature it is not possible
                        // We cannot make the parent class less accessible
        super.drink();
        System.out.println("Drinks Juice");
    }
}
public class TestRunTimePolymorphism {
    public static void main(String[] args){
//        Bauji bauji = new Bauji();
//        bauji.drink();

        Betuji betuji =  new Betuji();
        betuji.drink();


    }
}

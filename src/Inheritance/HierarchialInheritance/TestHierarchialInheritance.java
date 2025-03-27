package Inheritance.HierarchialInheritance;

class Dadiji{
    void silver(){
        System.out.println("Dadiji has silver");
    }
}
class Papaji extends Dadiji{
    void redCar(){
        System.out.println("Papaji has red car");
    }
}
class Uncleji extends Dadiji{
    void whiteCar(){
        System.out.println("Uncleji has white car");
    }
}
public class TestHierarchialInheritance {
    public static void main(String args[])
    {
        Papaji papaji = new Papaji();
        papaji.redCar();
        papaji.silver();
//      papaji.whiteCar(); // Cannot access siblings class properties

        Uncleji uncleji = new Uncleji();
        uncleji.whiteCar();
        uncleji.silver();

        Dadiji dadiji = new Dadiji();
        dadiji.silver();
    }
}

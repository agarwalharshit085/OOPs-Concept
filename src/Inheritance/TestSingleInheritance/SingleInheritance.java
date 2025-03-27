package Inheritance.TestSingleInheritance;

class Papa{
    void banglow()
    {
        System.out.println("Inside Papa's class");
    }
}
class Beta extends Papa{
    void fatFati()
    {
        System.out.println("Inside Beta's class");
    }
}
public class SingleInheritance {
    public static void main(String[] args)
    {
        Papa papa = new Papa();
        papa.banglow();
//      papa.fatFati()  // this will not work because parent cannot access child class property
        Beta beta = new Beta();
        beta.fatFati();
        beta.banglow();
    }
}

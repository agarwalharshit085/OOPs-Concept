package Abstraction;

interface Tea{
    void benefit();
}

class BlackTea implements Tea
{
    public void benefit(){
        System.out.println("Cleans the skin");
    }
}
class GreenTea implements Tea
{
    public void benefit(){
        System.out.println("Heart Health ");
    }
}
class LemonTea implements Tea
{
    public void benefit(){
        System.out.println("Energy");
    }
}
public class AbstractionThroughInterface {
    public static void main(String[] args)
    {
        Tea tea = new BlackTea();
        tea.benefit();
        tea = new GreenTea();
        tea.benefit();
        tea = new LemonTea();
        tea.benefit();
    }
}

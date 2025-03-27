package Abstraction;

interface OperatingSystem {
    void name();
}
class Windows implements OperatingSystem
{
    public void name()
    {
        System.out.println("Windows Operating System");
    }
}
class Mac implements OperatingSystem
{
    public void name()
    {
        System.out.println("Mac Operating System");
    }
}

public class CheckOS
{
    public static void main(String[] args)
    {
        OperatingSystem os = new Mac();
        os.name();
        os = new Windows();
        os.name();
    }
}

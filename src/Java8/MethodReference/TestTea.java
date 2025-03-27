package Java8.MethodReference;

interface Tea{
    void benefit();
}
class Black{
    Black(){
        System.out.println("Inside Black");
    }
    void benefit()
    {
        System.out.println("Good for heart");
    }
}

class Green{
    Green(){
        System.out.println("Inside Black");
    }
    void benefit()
    {
        System.out.println("Good for lungs");
    }
}
class Lemon{
    Lemon(){
        System.out.println("Inside Black");
    }
    void benefit()
    {
        System.out.println("Good for kidney");
    }
}
public class TestTea {
    public static void main(String[] args) {
        Tea t =new Black()::benefit;
        t.benefit();

        Tea t1 =new Green()::benefit;
        t.benefit();
        Tea t2 =new Lemon()::benefit;
        t.benefit();
    }
}

package Java8;

@FunctionalInterface
interface SayAble {
    void say();

//    void listen(); // Will give compilation error
//    default void listen(){} // any no of default methods are allowed
//        static void learn(){} // any no of static methods are allowed
}
//class SaySay implements SayAble{
//    public void say()
//    {
//        System.out.println("hi");
//    }
//}

public class TestSAM2 {
    public static void main(String[] args) {
//        SayAble sayAble = new SaySay();
//        sayAble.say();

//        or we can simply write in lambda expression without creating a separate class
        SayAble sayAble = () -> System.out.println("Hello! How are you ?");
        sayAble.say();

//        or we can simply write an anonymous class without creating a separate class
//        SayAble sayAble = new SayAble() {
//            @Override
//            public void say() {
//                System.out.println("Hello! How are you ?");
//            }
//        };
//        sayAble.say();
    }
}

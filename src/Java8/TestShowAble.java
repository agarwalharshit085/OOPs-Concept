package Java8;

@FunctionalInterface
interface Showable{
    void show(); // without return type without parameter
}

@FunctionalInterface
interface Learn{
    String learnJava();    //Without parameter with return type
}
@FunctionalInterface
interface Write{
    String writeJava(String str);    //With parameter with return type
}

@FunctionalInterface
interface Remember{
    void rememberJava(String str);    //With parameter without return type
}


class ShowShow implements Showable{

    @Override
    public void show() {
        System.out.println("Hello1");
    }
}

public class TestShowAble {

    public static void main(String[] args) {

        Showable showable = new ShowShow();
        showable.show();

        Showable showable1 = new Showable() {
            @Override
            public void show() {
                System.out.println("Hello2");
            }
        };
        showable1.show();

        Showable showable2 = ()-> System.out.println("Hello3");
        showable2.show();

        Learn learn = () -> {return "This is learn class";}; // if the curly bracket is there return keyword can be used otherwise not
        System.out.println(learn.learnJava());

        Write write = (String str) -> {
            return str;
        };
        System.out.println(write.writeJava("This is Write class"));

        Remember remember = (String str) -> {
            System.out.println("string : "+ str);
        };
        remember.rememberJava("You have to remember SAM");
    }
}

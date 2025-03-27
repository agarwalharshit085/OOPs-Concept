package Constructor;

public class TestConstructor {

    TestConstructor(){
        System.out.println("I am Inside Default constructor.");
    }

    TestConstructor(String str){
        System.out.println(str + " is inside parameterized constructor");
    }

    void show(){
        System.out.println("I am inside method show");
    }

    public static void main(String args[]){
        TestConstructor obj = new TestConstructor();
        obj = new TestConstructor("Harshit");
        obj.show();
    }
}

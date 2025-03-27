package ExceptionHandling;

public class TestThrows {

    void doTask() throws ArithmeticException
    {
        System.out.println("Doing it");
        try {
            doMoreTask();
        } catch (ArithmeticException e)
        {
            throw new ArithmeticException("There is a Division by Zero");
        }

    }
    void doMoreTask() throws ArithmeticException {
        System.out.println("Doing more task");
        int a = 4, b = 0;
        int c = 0;
        try {
            c = a / b;
        }
        catch (ArithmeticException e) {
            throw new ArithmeticException("There is a Division by Zero");
        }
        System.out.println(c);
    }
    public static void main(String[] args){

        TestThrows testCustomException = new TestThrows();
        try {
            testCustomException.doTask();
        } catch (ArithmeticException e) {
//            e.printStackTrace();
            System.out.println("Division by zero !!!");
        } finally {
            System.out.println("Execution completed");
        }
    }
}

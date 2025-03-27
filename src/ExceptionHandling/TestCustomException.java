package ExceptionHandling;

import static ExceptionHandling.CheckHeight.checkHeight;

class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}

class CheckHeight
{
    static void checkHeight(float height) throws MyException {
        if(height > 5.8) {
            System.out.println("You are Qualified to ");
        }
        else {
            throw new MyException("Bro You are not qualified to join the Army");
        }
    }
}
public class TestCustomException {
    public static void main(String[] args) throws MyException{
        checkHeight(5.5F);
    }
}

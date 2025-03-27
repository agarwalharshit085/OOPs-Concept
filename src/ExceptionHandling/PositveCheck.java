package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class CustomeException extends Exception{
    CustomeException(String msg){
        super(msg);
    }
}
public class PositveCheck {
    public static void main(String[] args) throws FileNotFoundException, CustomeException2 {

        FileReader fileReader = new FileReader("C:\\Users\\agarw\\Desktop\\CRANES Training\\Java\\JavaDemo\\src\\ExceptionHandling\\number.txt");
        try {
            int number = fileReader.read();
            if(number > 0)
                throw new CustomeException2("Number entered is positive.");
            while(true)
            {
                System.out.println(number);
                number = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


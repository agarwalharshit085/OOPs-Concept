package ExceptionHandling;

import java.io.*;

class CustomeException2 extends Exception{
    CustomeException2(String msg){
        super(msg);
    }
}
public class FileEmptyCheck {

    public static void main(String[] args) throws IOException, CustomeException2 {

        FileReader file = new FileReader("C:\\Users\\agarw\\Desktop\\CRANES Training\\Java\\JavaDemo\\src\\ExceptionHandling\\hello.txt");
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        throw new CustomeException2("File is empty. Cannot read further.");
    }
}

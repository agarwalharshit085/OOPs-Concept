package ExceptionHandling;

import java.io.*;

public class FileAndException {

    public static void fileRead(File file) throws IOException {
        if (!file.exists())                // Fix: Throw exception if file does not exist
            throw new FileNotFoundException("File Not Found");
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\agarw\\Desktop\\CRANES Training\\Java\\JavaDemo\\src\\ExceptionHandling\\demo.txt");

        try {
            fileRead(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

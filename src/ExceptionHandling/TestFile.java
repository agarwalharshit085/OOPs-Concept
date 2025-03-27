package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFile {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("C:\\Users\\agarw\\Desktop\\CRANES Training\\Java\\JavaDemo\\src\\ExceptionHandling\\hello.txt");
//        if(file.exists())
//        {
//            System.out.println(file.canRead());
//            System.out.println("File name : " + file.getName());
//            System.out.println("File parent : " + file.getParent());
//            System.out.println("File absolute path : " + file.getAbsolutePath());
//
//        }
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();

        while(line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }
}

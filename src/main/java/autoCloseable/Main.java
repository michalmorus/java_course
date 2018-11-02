package autoCloseable;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String... args) {

        try (MyAutoClosable myAutoClosable = new MyAutoClosable()) {
            File file = myAutoClosable.createTempFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("test");
            fileWriter.close();
            System.out.println(file.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

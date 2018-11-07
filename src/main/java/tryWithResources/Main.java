package tryWithResources;

import java.io.*;

public class Main {
    public static void main(String... args) {

        File file1 = null;
        File file2 = null;

        try {
            file1 = File.createTempFile("temp1", Long.toString(System.nanoTime()));
            file2 = File.createTempFile("temp2", Long.toString(System.nanoTime()));

        } catch (Exception e) {
            System.out.println("Cannot create file!");
            e.printStackTrace();
        }

        if (file1 == null || file2 == null) {
            return;
        }

        System.out.println(file1.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());

        try (FileWriter fileWriter = new FileWriter(file1.getAbsoluteFile())) {
            fileWriter.write("AAAABBBBCCCCDD TEST");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader(file1);
             FileWriter fileWriter = new FileWriter(file2.getAbsoluteFile())) {
            char[] buffer = new char[8];
            while (fileReader.read(buffer) > 0) {
                fileWriter.write(buffer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

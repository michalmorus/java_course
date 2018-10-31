package exceptions;

import java.io.*;

public class Main {
    public static void main(String... args) {

        File file;
        String content = "";
        try {
            file = new File("D:\\Projects\\learnJava\\src\\main\\java\\exceptions\\text.txt");
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String tmp;
                while ((tmp = bufferedReader.readLine()) != null) {
                    content += tmp;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IOException!");
        } catch (Exception e) {
            System.out.println("unknown exception");
        }

        System.out.println(content);
    }
}

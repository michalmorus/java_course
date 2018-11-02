package stringClasses;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Random;
import java.util.StringJoiner;

public class Main {
    public static void main(String ...args) {
        StringJoiner sj = new StringJoiner("--", "[[", "]]");
        sj.setEmptyValue("EMPTY");
        System.out.println(sj.toString());
        sj.add("value1").add("value2").add("value3");
        System.out.println(sj.toString());

        String text = String.format("Hello %d, %d, %d %s", 1, 2, 3, "hi");
        System.out.println(text);

        String formatted = String.format("float value 3.66666 %.1f ", 3.66666666f);
        System.out.println(formatted);

        int value = 84123123;
        String text2 = String.format("%d in octal: %#o hex: %#x", value, value, value);
        System.out.println(text2);

        System.out.println(String.format("spaces in text: %10d", 2));

        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("file.txt"));
            try (Formatter f = new Formatter(writer)) {
                f.format("text message random number %d", new Random().nextInt());
            }
        } catch (IOException e) {
            System.out.println("ERROR " + e.getMessage());
            e.printStackTrace();
        }


    }
}

package env;

import java.util.Map;

public class Main {
    public static void main(String ...args) {
        Map<String, String> settings = System.getenv();
        System.out.println(settings.toString());
    }
}

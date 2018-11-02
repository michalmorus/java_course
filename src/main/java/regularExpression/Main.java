package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String ...args) {

        String text = " you prefix a method definition with an asterisk (*), it becomes a generator method";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

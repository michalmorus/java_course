package stringEquality;

public class Main {
    public static void main(String ...args) {

        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "a";
        s3 += "bc";

        String s4 = "ab";
        s4 += "c";

        // !!!
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s3.intern() == s4.intern());
    }
}

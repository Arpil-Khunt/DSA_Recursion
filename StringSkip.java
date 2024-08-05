public class StringSkip {
    public static void main(String args[]) {
        System.out.println(skip("aabbccdda", ""));
    }

    static String skip(String s, String t) {
        if (s.isEmpty()) {
            return t;
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            return skip(s.substring(1), t);
        }
        return skip(s.substring(1), t + String.valueOf(ch));

    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        }
        return ch + skip(up.substring(1));
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }
        return up.charAt(0) + skipApple(up.substring(1));

    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        }
        return up.charAt(0) + skipAppNotApple(up.substring(1));

    }
}

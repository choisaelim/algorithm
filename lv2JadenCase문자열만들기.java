import java.util.*;

public class lv2JadenCase문자열만들기 {
    public static void main(String[] args) {
        String result = solution("3people unFollowed me");
        System.out.println(result);
    }

    public static String solution(String s) {
        s = s.toLowerCase();
        int ch = 0;
        for (int i = 0; i < s.length(); i++) {
            ch = (int) s.charAt(i);
            if (ch >= 97 && ch <= 122) {
                if (i == 0 || (i > 0 && s.charAt(i - 1) == ' ')) {
                    s = s.substring(0, i) + (char) (ch - 32) + s.substring(i + 1);
                }
            }
        }
        return s;
    }

}
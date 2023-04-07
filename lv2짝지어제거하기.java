import java.util.*;

public class lv2짝지어제거하기 {
    public static void main(String[] args) {
        int result = solution("baabaa");
        System.out.println(result);
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        char c = ' ';

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (stack.isEmpty())
                stack.push(c);
            else if (stack.peek() == c)
                stack.pop();
            else
                stack.push(c);
        }

        if (stack.isEmpty())
            return 1;
        else
            return 0;
    }
}

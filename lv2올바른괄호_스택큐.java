public class lv2올바른괄호_스택큐 {
    public static void main(String[] args) {
        boolean answer = solution("(())()");
        System.out.println(answer);
    }

    public static boolean solution(String str) {
        // 스택큐 문제로 되어있긴 한데 스택은 굳이 안써도 되는
        String s = "";
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            s = str.substring(i, i + 1);
            if (s.equals(")"))
                res -= 1;
            else
                res += 1;

            if (res == 0 && s.equals("(")) { // () or (()) > true
                // )( false
                return false;
            }
        }
        if (str.length() == 0 || res != 0) {
            return false;
        } else {
            return true;
        }
    }
}

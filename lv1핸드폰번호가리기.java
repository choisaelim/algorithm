public class lv1핸드폰번호가리기 {
    public static void main(String[] args) {
        String result = solution("027778888");

        System.out.println(result);
    }

    public static String solution(String phone_number) {
        String answer = "";

        // phone_number.length() - 4
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        return answer;
    }
}

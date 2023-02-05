
public class lv1가장가까운같은글자 {
    public static void main(String[] args) {
        String s = "foobar";
        solution(s);
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        int index = 0;
        answer[0] = -1;

        for (int i = 1; i < s.length(); i++) {
            index = s.lastIndexOf(s.substring(i, i + 1), i - 1);
            if (index > -1 && index != i) {
                answer[i] = i - index; // 인덱스가 2(3번째)인데 0이 같은 글자일 때 2
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}

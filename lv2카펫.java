import java.util.*;

public class lv2카펫 {
    public static void main(String[] args) {
        int[] result = solution(24, 24); // 10, 2 //24, 24
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] solution(int brown, int yellow) {

        int[] answer = new int[2];

        int sum = brown + yellow;
        int large = 0;

        for (int small = 2; small <= Math.round(Math.sqrt(sum)); small++) {
            // 9를 제곱근까지 나누다 보면 3*3
            // 12를 제곱근 3.XX까지 나누다 보면 3*4가 나옴
            if (sum % small == 0) {
                large = (int) sum / small;

                // large-2 * small-2 == yellow어야 답
                if ((large - 2) * (small - 2) == yellow) {
                    answer[0] = large;
                    answer[1] = small;
                    return answer;
                }
            }
        }

        return answer;
    }

}

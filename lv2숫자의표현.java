import java.util.*;

public class lv2숫자의표현 {
    public static void main(String[] args) {
        int result = solution(15);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        answer++;

        for (int i = 1; i < n; i++) {
            int j = i + 1;
            int sum = i;
            // 1 + 2 + 3 + 4
            while (sum < n) {
                sum += j;
                j++;
                if (sum == n)
                    answer++;
            }
        }

        return answer;
    }
}

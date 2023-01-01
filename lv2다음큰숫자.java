import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv2다음큰숫자 {
    public static void main(String[] args) {
        int answer = solution(78);
        System.out.println(answer);
    }

    public static int solution(int num) {
        int i = num + 1;
        int goal = Integer.bitCount(num);
        while (true) {
            if (goal == Integer.bitCount(i))
                return i;
            i++;
        }

    }
}

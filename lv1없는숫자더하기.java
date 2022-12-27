import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv1없는숫자더하기 {
    public static void main(String[] args) {
        int result = solution(new int[] { 1, 2, 3, 4, 6, 7, 8, 0 });
        System.out.println(result);
    }

    public static int solution(int[] numbers) {

        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += i;
        }

        for (int i : numbers) {
            sum -= i;
        }

        return sum;
    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class lv2최솟값만들기 {
    public static void main(String[] args) {
        int result = solution(new int[] { 1, 4, 2 }, new int[] { 5, 4, 4 });
        System.out.println(result);
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = B.length - 1; i >= 0; i--) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv0중앙값구하기 {
    public static void main(String[] args) {
        int result = solution(new int[] { 1, 2, 7, 10, 11 });
        System.out.println(result);
    }

    public static int solution(int[] array) {

        int result = 0;

        List<Integer> list = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        result = list.get((list.size() - 1) / 2);

        return result;
    }
}

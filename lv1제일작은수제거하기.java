import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv1제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = solution(new int[] { 10 });
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int min = list.stream().mapToInt(x -> x).min().orElse(-1);
        if (min > -1)
            list.remove(list.indexOf(min));

        if (list.size() == 0)
            return new int[] { -1 };
        else
            return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

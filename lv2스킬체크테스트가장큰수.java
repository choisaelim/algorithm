import java.util.*;
import java.util.stream.Collectors;

public class lv2스킬체크테스트가장큰수 {
    public static void main(String[] args) {
        String result = solution(new int[] { 0 });
        System.out.println(result);
    }

    public static String solution(int[] numbers) {
        String result = "";

        final Comparator<Integer> comp = (p1, p2) -> {
            String num1 = String.valueOf(p1);
            String num2 = String.valueOf(p2);
            // 결과가 - 이면 그대로, +이면 순서 바꿈
            // 3, 30 있을 때 330이 더 크므로 num2+num1(303) - num1+num2(330)이 -가 되어야 함
            return Integer.valueOf(num2 + num1) - Integer.valueOf(num1 + num2);
        };

        result = Arrays.stream(numbers).boxed()
                .sorted(comp)
                .map(String::valueOf).collect(Collectors.joining());

        if ("0".equals(result.substring(0, 1)))
            return "0";
        return result;
    }
}

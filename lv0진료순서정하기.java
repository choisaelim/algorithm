import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lv0진료순서정하기 {
    public static void main(String[] args) {
        int[] answer = solution(new int[] { 3, 15, 5 });
        for (int i : answer) {
            System.out.println(i + " ");
        }
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // 제일 큰 수가 첫번째로 오도록(내림차순) 정렬 후 index 구하면 0이므로 index + 1이 순위
        List<Integer> sortlist = Arrays.stream(emergency).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        for (int i = 0; i < emergency.length; i++) {
            answer[i] = sortlist.indexOf(emergency[i]) + 1;
        }

        return answer;
    }
}

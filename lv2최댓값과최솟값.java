import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv2최댓값과최솟값 {
    public static void main(String[] args) {
        String result = solution("-1 -2 -3 -4");
        System.out.println(result);
    }

    public static String solution(String s) {
        String answer = "";
        String tmp = "";
        int tempNum = 0;
        s += " ";

        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        // 풀이 본 후
        for (String numStr : arr) {
            int num = Integer.parseInt(numStr);
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        // 풀이 보기 전
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (c == ' ') {
        // tempNum = Integer.parseInt(tmp);
        // if (tempNum < min)
        // min = tempNum;
        // if (tempNum > max)
        // max = tempNum;
        // tmp = "";
        // } else {
        // tmp += c;
        // }
        // }

        answer = min + " " + max;

        return answer;
    }
}

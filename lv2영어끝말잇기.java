import java.util.*;
public class lv2영어끝말잇기 {
    public static void main(String[] args) {
        int[] result = solution(3,
                new String[] { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" });
        System.out.println(result[0] + result[1]);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            // 이전에 했던 단어면
            if (map.containsKey(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = (int) Math.floor(i / n) + 1;
                return answer;
            } else {
                map.put(words[i], 1);
            }

            if (i > 0) {
                if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                    answer[0] = i % n + 1;
                    answer[1] = (int) Math.floor(i / n) + 1;
                    return answer;
                }
            }
        }

        return answer;
    }
}

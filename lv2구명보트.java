import java.util.*;

public class lv2구명보트 {
    public static void main(String[] args) {
        int result = solution(new int[] { 40, 50, 60, 80 }, 100);
        System.out.println(result);
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;

        while (end >= start) {
            if (people[end] + people[start] > limit) {
                answer++;
                end--;
            } else {
                answer++;
                start++;
                end--;
            }
        }

        return answer;
    }
}

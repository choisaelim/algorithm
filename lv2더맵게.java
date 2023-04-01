import java.util.*;

public class lv2더맵게 {
    public static void main(String[] args) {
        int result = solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7);
        System.out.println(result);
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        int first = 0;
        int second = 0;

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i : scoville) {
            que.offer(i);
        }

        while (que.peek() < K) {
            if (que.size() == 1)
                return -1;
            first = que.poll();
            second = que.poll();

            que.offer(first + second * 2);
            answer++;
        }

        return answer;
    }
}

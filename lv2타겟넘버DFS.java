import java.util.*;

public class lv2타겟넘버DFS {
    HashSet<Integer> numberSet = new HashSet<>();

    public static void main(String[] args) {
        lv2타겟넘버DFS cl = new lv2타겟넘버DFS();
        int result = cl.solution(new int[] { 1, 1, 1, 1, 1 }, 3);
        System.out.println(result);
    }

    public int solution(int[] numbers, int target) {
        int result = 0;
        lv2타겟넘버DFS cl = new lv2타겟넘버DFS();

        result = cl.getTree(target, numbers, 0, 0);

        return result;
    }

    public int getTree(int target, int[] numbers, int current, int depth) {
        // current는 합이 target이 될 때까지 + - 반복하는 수
        // target은 목표로 하는 숫자
        // depth는 횟수
        if (depth == numbers.length) {
            if (current == target)
                return 1;
            else
                return 0;
        } else {
            depth++;

            return getTree(target, numbers, current + numbers[depth - 1], depth) +
                    getTree(target, numbers, current - numbers[depth - 1], depth);
        }
    }

}

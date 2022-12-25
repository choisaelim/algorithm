import java.util.Stack;

public class lv1같은숫자는싫어_스택 {
    public static void main(String[] args) {
        int[] answer = solution(new int[] { 1, 1, 3, 3, 0, 1, 1 });
        for (int i : answer) {
            System.out.println(i + " ");
        }
    }

    public static int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        // 이전 값이랑 비교하려고 stack을 썼는데
        // ArrayList로 써도 크게 상관없을듯
        for (int i : arr) {
            if (stack.size() == 0)
                stack.push(Integer.valueOf(i));
            else if (stack.peek() != Integer.valueOf(i))
                stack.push(Integer.valueOf(i));
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        return answer;
    }
}

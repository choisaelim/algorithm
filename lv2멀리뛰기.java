public class lv2멀리뛰기 {
    public static void main(String[] args) {
        long result = solution(4);
        System.out.println(result);
    }

    public static long solution(int n) {
        long answer = 0;

        long prevprev = 1;
        long prev = 2;

        if (n == 1)
            return prevprev;
        if (n == 2)
            return prev;

        for (int i = 3; i <= n; i++) {
            answer = (prev + prevprev) % 1234567;
            prevprev = prev;
            prev = answer;
        }

        return answer;
    }
}

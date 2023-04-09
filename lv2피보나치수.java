public class lv2피보나치수 {
    public static void main(String[] args) {
        int result = solution(3);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        int prevprev = 0;
        int prev = 1;

        int num = 0;
        for (int i = 2; i <= n; i++) {
            num = (prevprev + prev) % 1234567;

            prevprev = prev;
            prev = num;
            // n = 2이면 0 + 1
            // n = 3이면 0 + 1 / 1 + 1
            // n = 4 (F(0) + F(1))
        }

        answer = num;
        return answer;
    }
}

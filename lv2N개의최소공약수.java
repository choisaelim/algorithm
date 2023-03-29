import java.util.Arrays;
import java.util.Collections;

public class lv2N개의최소공약수 {
    public static void main(String[] args) {
        int result = solution(new int[] { 2, 6, 8, 14 });
        System.out.println(result);
    }

    public static int solution(int[] arr) {
        int answer = 0;

        int lcm = arr[0];

        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }

        answer = lcm;
        return answer;
    }

    public static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        return a * b / gcd;
    }

    // 큰 수 a 작은 수 b
    // 최대공약수 구하기
    public static int getGCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return getGCD(b, a % b);
    }
}

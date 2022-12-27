import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class lv1부족한금액계산하기 {
    public static void main(String[] args) {
        long result = solution(3, 20, 4);
        System.out.println(result);
    }

    public static long solution(int price, int money, int count) {
        long result = 0;

        long sum = 0;
        long num = 0;
        for (int i = 1; i <= count; i++) {
            num += i;
        }
        sum = num * price;

        if (money > sum)
            return 0;
        else
            result = sum - money;
        return result;
    }
}

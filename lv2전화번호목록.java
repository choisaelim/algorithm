import java.util.Arrays;

public class lv2전화번호목록 {
    public static void main(String[] args) {
        boolean result = solution(new String[] { "119", "97674223", "1195524421" });
        System.out.println(result);
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].charAt(0) != phone_book[i].charAt(0))
                continue;

            if (phone_book[i + 1].startsWith(phone_book[i]))
                return false;

        }
        return answer;
    }
}

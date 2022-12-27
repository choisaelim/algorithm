public class lv2스킬체크테스트2진수 {
    public static void main(String[] args) {
        int result = solution(15);
        System.out.println(result);
    }

    public static int solution(int num) {

        int result = 0;
        int count = Integer.bitCount(num);

        while (true) {
            num++;
            if (count == Integer.bitCount(num)) {
                result = num;
                break;
            }
        }

        return result;
    }
}

import java.util.*;

public class lv2소수찾기 {
    HashSet<Integer> numberSet = new HashSet<>();

    public static void main(String[] args) {
        lv2소수찾기 cl = new lv2소수찾기();
        int result = cl.solution("011");
        System.out.println(cl.isNum(101));
    }

    public int solution(String number) {
        int result = 0;
        lv2소수찾기 cl = new lv2소수찾기();

        cl.getNumber("", number);

        for (Integer n : cl.numberSet) {
            if (isNum((int) n))
                result++;
        }

        return result;
    }

    public void getNumber(String comb, String others) {
        if (!comb.equals("")) {
            numberSet.add(Integer.valueOf(comb));
        }

        for (int i = 0; i < others.length(); i++) {
            getNumber(comb + others.charAt(i),
                    others.substring(0, i) + others.substring(i + 1));
        }
    }

    public boolean isNum(int num) {
        if (num <= 1 || num % 2 == 0)
            return false;
        int sqrt = (int) Math.round(Math.sqrt(num));
        for (int i = 3; i <= sqrt; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

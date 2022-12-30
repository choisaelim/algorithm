import java.util.*;

public class lv1두수의합 {
    public static void main(String[] args) {
        int[] result = solution(new int[] { 5, 0, 2, 7 });
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }

    public static int[] solution(int[] numbers) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (list.indexOf(numbers[i] + numbers[j]) == -1) {
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        int[] result = new int[list.size()];
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}

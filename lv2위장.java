import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lv2위장 {
    public static void main(String[] args) {
        int result = solution(new String[][] { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
                { "green_turban", "headgear" } });
        System.out.println(result);
    }

    public static int solution(String[][] clothes) {
        int answer = 0;
        // 1-a 2-a 1-b 2 1 / a-b 2 = 5
        // 1-a 2-a 3-a 3
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < clothes.length; i++) {
            List<String> list = new ArrayList<String>();
            if (map.containsKey(clothes[i][1])) {
                list = map.get(clothes[i][1]);
            }
            list.add(clothes[i][0]);
            map.put(clothes[i][1], list);
        }
        int size = 1;
        for (String key : map.keySet()) {
            size *= (map.get(key).size() + 1);
        }
        answer += size;
        answer--;
        return answer;
    }
}

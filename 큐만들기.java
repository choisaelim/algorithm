import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 큐만들기 {
    public static void main(String[] args) {
        큐만들기 d = new 큐만들기();

        int[] answer = d.solution(new int[] { 2, 1, 3, 1, 2, 1 });
        for (int i : answer) {
            System.out.println(i);
        }

    }

    public int[] solution(int[] queue) {

        int[] answer = new int[3];

        int goal = queue.length / 3;

        List<Integer> list = Arrays.stream(queue).boxed().collect(Collectors.toList());

        int[] count = new int[3];

        count[0] = Long.valueOf((list.stream().filter(x -> x == 1).count())).intValue();
        count[1] = Long.valueOf((list.stream().filter(x -> x == 2).count())).intValue();
        count[2] = Long.valueOf((list.stream().filter(x -> x == 3).count())).intValue();

        // 첫번째 숫자를 담을 변수
        int first = 0;
        int min = 999;
        int minIndex = 0;
        boolean ok = true;

        while (true) {
            min = 999;
            ok = true;
            // 가장 적은 빈도의 숫자 찾기
            for (int i = 0; i < count.length; i++) {
                // 숫자가 모두 같은지 확인
                if (count[i] != goal)
                    ok = false;

                // 1,2,3 중 가장 적은 빈도의 인덱스 저장
                if (min > count[i]) {
                    min = count[i];
                    minIndex = i;
                }
            }

            if (ok)
                break; // 1,2,3 개수가 같으면 반복문 탈출

            first = list.get(0);
            // 제일 작은 숫자 추가
            list.add(minIndex + 1);
            list.remove(0);
            count[first - 1]--; // 세 개의 숫자 중 가장 앞에 있는 숫자의 갯수 감소시킴
            count[minIndex]++;
            answer[minIndex] += 1;
        }

        return answer;
    }
}

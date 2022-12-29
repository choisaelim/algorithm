import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 디렉토리찾기 {

    class Node {
        private int data;
        private Node leftNode;
        private Node rightNode;

        public Node(int data, Node leftNode, Node rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public void setLeftNode(Node node) {
            this.leftNode = node;
        }

        public void setRightNode(Node node) {
            this.rightNode = node;
        }

        public Node getLeftNode() {
            return this.leftNode;
        }

        public Node getRightNode() {
            return this.rightNode;
        }
    }

    class Tree {
        private Node root;

        public void addNode(int value, Node left, Node right) {
            // if(root == null){
            root = new Node(value, left, right);

        }
    }

    public static void main(String[] args) {
        디렉토리찾기 d = new 디렉토리찾기();

        int answer = d.solution(7, new int[][] { { 1, 2 }, { 2, 5 }, { 2, 6 }, { 1, 3 }, { 3, 4 }, { 1, 7 } },
                new String[] { "root", "cs", "direc", "aa", "bbb", "ccc", "solution" });
        System.out.println(answer);
    }

    public int solution(int num, int[][] arr, String[] dirNames) {
        int answer = 0;

        // 첫번째 인수 기준으로 내림차순 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    // return o2[1] - o1[1];
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }
        });
        Tree tree = new Tree();

        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < arr[i].length; j++) {
            // System.out.print(arr[i][j] + " ");
            // }
            tree.addNode(arr[i][0], null, null);

            System.out.println();
        }

        // 1-2-5
        // 1-2-6
        // 1-3-4
        // 1-7

        return answer;
    }
}

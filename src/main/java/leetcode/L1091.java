/**
 * （1）BFS的问题一般都会选用队列方式实现；
 * （2）代码模板如下：
 * <p>
 * void BFS()
 * {
 * 定义队列;
 * 定义备忘录，用于记录已经访问的位置；
 * <p>
 * 判断边界条件，是否能直接返回结果的。
 * <p>
 * 将起始位置加入到队列中，同时更新备忘录。
 * <p>
 * while (队列不为空) {
 * 获取当前队列中的元素个数。
 * for (元素个数) {
 * 取出一个位置节点。
 * 判断是否到达终点位置。
 * 获取它对应的下一个所有的节点。
 * 条件判断，过滤掉不符合条件的位置。
 * 新位置重新加入队列。
 * }
 * }
 * <p>
 * }
 */

package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L1091 {
    private int M;
    private int N;
    private int[][] trace;

    public int shortestPathBinaryMatrix(int[][] grid) {
        this.M = grid.length;
        this.N = grid[0].length;
        this.trace = new int[M][N];

        if (grid[0][0] == 1 || grid[M - 1][N - 1] == 1) {
            return -1;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0, 0));
        trace[0][0] = 1;
        int cnt = 0;

        while (queue.size() != 0) {
            cnt++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.x == M - 1 && node.y == N - 1) {
                    return cnt;
                }

                //八个方向
                List<Node> list = new ArrayList<Node>();
                list.add(new Node(node.x - 1, node.y));//up
                list.add(new Node(node.x + 1, node.y));//down
                list.add(new Node(node.x, node.y - 1));//left
                list.add(new Node(node.x, node.y + 1));//right

                list.add(new Node(node.x - 1, node.y - 1));//up left
                list.add(new Node(node.x + 1, node.y - 1));//down left
                list.add(new Node(node.x - 1, node.y + 1));//up right
                list.add(new Node(node.x + 1, node.y + 1));//down right


                for (Node subNode : list) {

                    if (subNode.x < 0 || subNode.x >= M || subNode.y < 0 || subNode.y >= N) {
                        continue;
                    }

                    if (trace[subNode.x][subNode.y] == 1) {
                        continue;
                    }

                    if (grid[subNode.x][subNode.y] == 1) {
                        continue;
                    }

                    trace[subNode.x][subNode.y] = 1;
                    queue.add(subNode);
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1},
                {1, 0}};
        int[][] matrix2 = {
                {0, 0, 0},
                {1, 1, 0},
                {1, 1, 0}};

        int[][] matrix3 = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        L1091 l1091 = new L1091();

        System.out.println(l1091.shortestPathBinaryMatrix(matrix3));
    }
}

class Node {
    public int x;
    public int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

package leetcode;

public class L1293 {

    private int[][] trace;
    private int cntStep = -1;
    private int maxDel;

    public int shortestPath(int[][] grid, int k) {
        trace = new int[grid.length][grid[0].length];
        maxDel = k;
        cntStep = -1;

        walk(grid, 0, 0, 0, 0);
        return cntStep;
    }

    private void walk(int[][] grid, int i, int j, int delCnt, int step) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && delCnt <= maxDel && trace[i][j] == 0) {

            if (i == grid.length - 1 && j == grid[0].length - 1) {
                if (cntStep == -1 || cntStep > step) {
                    cntStep = step;
                }
                return;
            }

            if (grid[i][j] == 1) {
                delCnt++;
            }


            trace[i][j] = 1;

            walk(grid, i - 1, j, delCnt, step + 1);//up
            walk(grid, i + 1, j, delCnt, step + 1);//down
            walk(grid, i, j - 1, delCnt, step + 1);//left
            walk(grid, i, j + 1, delCnt, step + 1);//right

            trace[i][j] = 0;
        }

    }

    public static void main(String[] args) {


        int[][] grid1 = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}};
        L1293 l1293 = new L1293();
        System.out.println(l1293.shortestPath(grid1, 1));


        int[][] grid2 = {
                {0, 1, 1},
                {1, 1, 1},
                {1, 0, 0}};
        System.out.println(l1293.shortestPath(grid2, 1));


        int[][] grid3 = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1},
                {0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1},
                {1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}};
        System.out.println(l1293.shortestPath(grid3, 27));


    }


}

package kata.java.junit;

public class GameOfLife {
    private static final int ALIVE = 1;
    private static final int DEAD = 0;

    private final int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    private static int[][] neighborsPositions(int row, int col) {
        return new int[][]{
                {row - 1, col}, // top
                {row, col - 1}, // left
                {row, col + 1}, // right
                {row + 1, col}, // bottom
                {row - 1, col - 1}, // top left
                {row - 1, col + 1}, // top right
                {row + 1, col - 1}, // bottom left
                {row + 1, col + 1}, // bottom left
        };
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        for (int[] pos : neighborsPositions(row, col)) {
            if (isLiving(pos[0], pos[1])) countLivingCells++;
        }
        return countLivingCells;
    }

    public void setLiving(int row, int col) {
        setLiving(row, col, true);
    }

    private void setDies(int row, int col) {
        setLiving(row, col, false);
    }

    private void setLiving(int row, int col, boolean toAlive) {
        cells[row][col] = toAlive ? ALIVE : DEAD;
    }

    public boolean isLiving(int row, int col) {
        if (isOuterCell(row, col)) return false;
        return cells[row][col] == ALIVE;
    }

    private boolean isOuterCell(int row, int col) {
        return row < 0
                || row >= cells.length
                || col < 0
                || col >= cells[0].length;
    }

    public void evolve() {
        int[][] neighborsAnalysis = neighborsAnalysis(cells);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (neighborsAnalysis[i][j] < 2
                        || neighborsAnalysis[i][j] > 3) {
                    setDies(i, j);
                }
                if (neighborsAnalysis[i][j] == 3) {
                    setLiving(i, j);
                }
            }
        }
    }

    private int[][] neighborsAnalysis(int[][] cells) {
        int[][] neighborsAnalysis = new int[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                neighborsAnalysis[i][j] = countLivingNeighbors(i, j);
            }
        }
        return neighborsAnalysis;
    }
}

package kata.java.junit;

public class GameOfLife {
    private static final int ALIVE = 1;

    private final int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        int[][] neighbors = {
                {row - 1, col},
                {row, col - 1},
                {row, col + 1}
        };
        for (int[] pos : neighbors) {
            if (isLivingCell(pos[0], pos[1])) {
                countLivingCells++;
            }
        }
        return countLivingCells;
    }

    public void setLiving(int row, int col) {
        cells[row][col] = ALIVE;
    }

    private boolean isLivingCell(int row, int col) {
        return cells[row][col] == ALIVE;
    }
}

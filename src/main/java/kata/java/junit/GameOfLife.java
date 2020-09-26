package kata.java.junit;

public class GameOfLife {
    private static final int ALIVE = 1;

    private final int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        if (isLivingCell(row, col - 1)) {
            countLivingCells++;
        }
        if (isLivingCell(row, col + 1)) {
            countLivingCells++;
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

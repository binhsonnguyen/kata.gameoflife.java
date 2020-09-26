package kata.java.junit;

public class GameOfLife {
    private static final int ALIVE = 1;

    private final int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        int[] neighbors = {
                cells[row - 1][col],
                cells[row][col - 1],
                cells[row][col + 1],
        };
        for (int cell : neighbors) {
            if (isLiving(cell)) countLivingCells++;
        }
        return countLivingCells;
    }

    public void setLiving(int row, int col) {
        cells[row][col] = ALIVE;
    }

    private boolean isLiving(int cell) {
        return cell == ALIVE;
    }
}

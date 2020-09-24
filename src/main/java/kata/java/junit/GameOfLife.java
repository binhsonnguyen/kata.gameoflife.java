package kata.java.junit;

public class GameOfLife {
    private int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        if (isLivingCell(row, col - 1)) {
            countLivingCells++;
        }
        return countLivingCells;
    }

    public void setLiving(int row, int col) {
        cells[row][col] = 1;
    }

    private boolean isLivingCell(int row, int col) {
        return cells[row][col] == 1;
    }
}

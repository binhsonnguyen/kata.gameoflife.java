package kata.java.junit;

public class GameOfLife {
    private static final int ALIVE = 1;

    private final int[][] cells;

    public GameOfLife(int rows, int cols) {
        cells = new int[rows][cols];
    }

    public int countLivingNeighbors(int row, int col) {
        int countLivingCells = 0;
        int[][] neighborsPositions = {
                {row - 1, col}, // top
                {row, col - 1}, // left
                {row, col + 1}, // right
                {row + 1, col}, // bottom
                {row - 1, col - 1}, // top left
                {row - 1, col + 1}, // top right
                {row + 1, col - 1}, // bottom left
                {row + 1, col + 1}, // bottom left
        };
        for (int[] pos : neighborsPositions) {
            if (isLiving(pos[0], pos[1])) countLivingCells++;
        }
        return countLivingCells;
    }

    public void setLiving(int row, int col) {
        cells[row][col] = ALIVE;
    }

    private boolean isLiving(int row, int col) {
        if (row < 0) return false;
        return cells[row][col] == ALIVE;
    }
}

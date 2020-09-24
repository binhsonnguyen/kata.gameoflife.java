package kata.java.junit;

public class GameOfLife {
    private int hasLivingCell = 0;

    public GameOfLife(int rows, int cols) {

    }

    public int countLivingNeighbors(int row, int col) {
        return hasLivingCell;
    }

    public void setLiving(int row, int col) {
        hasLivingCell++;
    }
}

package kata.java.junit;

public class GameOfLife {
    private boolean hasLivingCell = false;

    public GameOfLife(int rows, int cols) {

    }

    public int countLivingNeighbors(int row, int col) {
        return hasLivingCell ? 1 : 0;
    }

    public void setLiving(int row, int col) {
        hasLivingCell = true;
    }
}

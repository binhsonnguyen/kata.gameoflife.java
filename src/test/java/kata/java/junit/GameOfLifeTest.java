package kata.java.junit;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class GameOfLifeTest {
    @Test
    void foundsNoLivingNeighborsInAnEmptyUniverse() {
        GameOfLife game = new GameOfLife(4, 8);
        assertEquals(0, game.countLivingNeighbors(1, 3));
    }

    @Test
    void foundsOneLivingNeighbour() {
        GameOfLife game = new GameOfLife(4, 8);
        game.setLiving(1, 3);
        assertEquals(1, game.countLivingNeighbors(1, 4));
    }
}

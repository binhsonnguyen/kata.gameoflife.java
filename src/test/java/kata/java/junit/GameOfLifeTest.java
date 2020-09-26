package kata.java.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class GameOfLifeTest {
    private GameOfLife game;

    @BeforeEach
    void initGame() {
        game = new GameOfLife(4, 8);
    }

    @Test
    void foundsNoLivingNeighborsInAnEmptyUniverse() {
        assertEquals(0, game.countLivingNeighbors(1, 3));
    }

    @Test
    void foundsOneLivingNeighbour() {
        game.setLiving(1, 3);
        assertEquals(1, game.countLivingNeighbors(1, 4));
    }

    @Test
    void foundsOneLivingNeighboursAtNextLeft() {
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        assertEquals(1, game.countLivingNeighbors(1, 4));
    }

    @Test
    void foundsOneLivingNeighboursAtNextRight() {
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        assertEquals(2, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtTop() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        assertEquals(3, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtBottom() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        game.setLiving(2, 2);
        assertEquals(4, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtTopLeft() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        game.setLiving(2, 2);
        game.setLiving(0, 1);
        assertEquals(5, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtTopRight() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        game.setLiving(2, 2);
        game.setLiving(0, 1);
        game.setLiving(0, 3);
        assertEquals(6, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtTopBottomLeft() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        game.setLiving(2, 2);
        game.setLiving(0, 1);
        game.setLiving(0, 3);
        game.setLiving(2, 1);
        assertEquals(7, game.countLivingNeighbors(1, 2));
    }

    @Test
    void foundsOneLivingNeighboursAtTopBottomRight() {
        game.setLiving(0, 2);
        game.setLiving(1, 1);
        game.setLiving(1, 3);
        game.setLiving(2, 2);
        game.setLiving(0, 1);
        game.setLiving(0, 3);
        game.setLiving(2, 1);
        game.setLiving(2, 3);
        assertEquals(8, game.countLivingNeighbors(1, 2));
    }
}

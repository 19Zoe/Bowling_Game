package cn.edu.jnu.x2020100487;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }

    @Test
    public void test20Zeros(){
        repeatedroll(20, 0);
        assertEquals(0, game.score());
    }

    private void repeatedroll(int times, int pin) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }

    @Test
    public void test2(){
        repeatedroll(10, 3);
        repeatedroll(10, 2);
        assertEquals(50, game.score());
    }

    @Test
    public void test3(){
        game.roll(5);
        game.roll(5);  //一次补中，第一轮得10+6=16分
        game.roll(6);
        repeatedroll(17, 3);
        assertEquals(76, game.score());
    }
}
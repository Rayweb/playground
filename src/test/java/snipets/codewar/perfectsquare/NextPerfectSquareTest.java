package snipets.codewar.perfectsquare;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * You might know some pretty large perfect squares. But what about the NEXT one?
 *
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 *
 * If the parameter is itself not a perfect square, than -1 should be returned. You may assume the parameter is positive.
 *
 * Examples:
 *
 * findNextSquare(121) --> returns 144
 * findNextSquare(625) --> returns 676
 * findNextSquare(114) --> returns -1 since 114 is not a perfect
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NextPerfectSquareTest {
    NextPerfectSquare omarImpl;
    @BeforeEach
    public void setUp(){
         omarImpl= new Omar();
    }
    @Test
    public void test1() {

        assertEquals(144, omarImpl.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, omarImpl.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, omarImpl.findNextSquare(114));
    }
}

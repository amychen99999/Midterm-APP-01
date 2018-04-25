package tw.edu.ntut.csie.app01_103a50035;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScoreToGadeUnitTest {
    private   ScoreToGrade sg;

    @Before
    public void setUp(){
        sg = new ScoreToGrade();
    }

    @After
    public void tearDown(){
        sg = null;
    }

    @Test
    public void testLetterGrade() {
        assertEquals("X", sg.letterGrade(101));
        assertEquals("A", sg.letterGrade(90));
        assertEquals("B", sg.letterGrade(80));
        assertEquals("C", sg.letterGrade(70));
        assertEquals("D", sg.letterGrade(60));
        assertEquals("F", sg.letterGrade(0));
        assertEquals("X", sg.letterGrade(-1));
    }
}
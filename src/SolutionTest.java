import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;

    @Before
    public void setup(){
        solution = new Solution();
    }
    
    @Test
    public void OrderPleaseTest() {
        assertEquals("Thi1s is2 3a T4est", solution.orderPlease("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", solution.orderPlease("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals(" ", solution.orderPlease(" "));
    }
}
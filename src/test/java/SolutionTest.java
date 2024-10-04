import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] skill = {2,3,4,2,5,5};
        long expected = 32;
        long actual = new Solution().dividePlayers(skill);

        Assert.assertEquals(expected, actual);
    }
}

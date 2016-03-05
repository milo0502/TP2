package firstMavenProject;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2016/03/05.
 */
public class FailingTest {
    private Tester tester;

    @Test
    public void failTest(){
        tester = new Tester();
        int total = tester.addNumbers(2,3);

        Assert.assertEquals(6,total);
    }
}

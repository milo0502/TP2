import junit.framework.Assert;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.Timeout;
public class DivTest {
    Division d;
    @Test
    public void divisionTest()
    {
        d = new Division();
        double total = d.division(1.0,0.5);
        Assert.assertEquals(0.5,total);
    }
}

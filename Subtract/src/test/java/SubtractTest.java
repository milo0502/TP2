import junit.framework.Assert;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.Timeout;
public class SubtractTest {
    Subtract s;
    @Test
    public void subtractTest()
    {
        s = new Subtract();
        double total = s.subtract(20.5,2.0);
        Assert.assertEquals(18.5,total);
    }
}

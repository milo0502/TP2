import junit.framework.Assert;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.Timeout;
public class MultiplyTest {
    Multiply m;
    public void multiplyTest()
    {
        m = new Multiply();
        double total = m.multiply(2.0,1.5);

        Assert.assertEquals(3.0,total);
    }
}

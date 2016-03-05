import junit.framework.Assert;

/**
 * Created by student on 2016/03/05.
 */
import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.Timeout;
public class AddTest {
    Add a;
    @Test
    public void addTest()
    {
        a = new Add();
        double total = a.add(5.1,3.6);
        Assert.assertEquals(8.7,total);
    }


}

package firstMavenProject;

import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.Timeout;

/**
 * Created by student on 2016/02/29.
 */
public class TestProgram
{
    private Tester tester;
    @Rule
    public Timeout globalTimeout=new Timeout(55);
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Program started");
    }

    @Test
    public void testRound() throws Exception
    {
        tester = new Tester();
        double result = tester.roundDouble(4.2);

        Assert.assertEquals(5.0, result);
    }

    @Test
    public void testAdd() throws Exception
    {
        tester = new Tester();
        int result = tester.addNumbers(3,2);

        Assert.assertEquals(5, result);
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        tester = new Tester();
        String a = "Obj1";
        int b = 12;
        boolean result = tester.compareObjects(2, b);

        Assert.assertEquals(true, result);
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        tester = new Tester();
        Object a = "Obj1";
        Object b = 12;

        boolean result = tester.isInteger(a);

        Assert.assertEquals(true, result);
    }

    @Test
    public void testString() throws Exception
    {
        tester = new Tester();
        String s1 = "Hello";
        String s2 = "Hello";
        boolean result = tester.compareStrings(s1, s2);

        Assert.assertEquals(true, result);
    }
    @Test
    public void testFalse() throws Exception
    {
        tester = new Tester();
        String s1 = "Hello";
        String s2 = "Hi";
        boolean result = tester.compareStrings(s1, s2);

        Assert.assertEquals(false, result);
    }
    @Test
    public void testNull() throws Exception
    {
        tester = new Tester();
        String s1 = tester.isNull("hello");

        Assert.assertNull("hello",s1);

    }
    @Test
    public void testNonNullness() throws Exception
    {
        tester = new Tester();
        String s1 = tester.isNotNull("hello");

        Assert.assertNotNull(s1);

    }
    @Test
    public void timeoutTest()throws Exception
    {
        Thread.sleep(41);
    }
    @Ignore
    public void disablingTest()
    {

    }



}

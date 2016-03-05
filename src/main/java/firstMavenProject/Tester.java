package firstMavenProject;

/**
 * Created by student on 2016/02/29.
 */
public class Tester
{
    public double roundDouble(double a)
    {
        return 5.0;
    }
    public int addNumbers(int a, int b)
    {
        return a+b;
    }
    public boolean compareStrings(String s1, String s2)
    {
        return s1.equals(s2);
    }
    public boolean compareObjects(Object o1, Object o2)
    {
        return o1.getClass() == o2.getClass();
    }

    public boolean isInteger(Object a)
    {
        return a.getClass().getSimpleName().equals("String");
    }
    public String isNull(String a)
    {
        return null;
    }
    public String isNotNull(String a)
    {
        return "not null";
    }
}

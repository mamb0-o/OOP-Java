package decorator;

public class Foo
    implements Stringable
{
    private final String str;

    public Foo(final String s)
    {
        str = s;
    }

    @Override
    public String asString()
    {
        return str;
    }
}

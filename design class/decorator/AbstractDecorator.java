package decorator;

public abstract class AbstractDecorator
    implements Stringable
{
    private final Stringable target;

    protected AbstractDecorator(final Stringable s)
    {
        target = s;
    }

    @Override
    public final String asString()
    {
        final String str;
        final String retVal;

        str    = target.asString();
        retVal = doAsString(str);

        return retVal;
    }

    protected abstract String doAsString(String str);
}

package decorator;


public class LowerDecorator
        extends AbstractDecorator
{
    public LowerDecorator(final Stringable s)
    {
        super(s);
    }

    @Override
    protected String doAsString(final String str)
    {
        return str.toLowerCase();
    }
}

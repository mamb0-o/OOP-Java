package decorator;


public class UpperDecorator
    extends AbstractDecorator
{
    public UpperDecorator(final Stringable s)
    {
        super(s);
    }

    @Override
    protected String doAsString(final String str)
    {
        return str.toUpperCase();
    }
}

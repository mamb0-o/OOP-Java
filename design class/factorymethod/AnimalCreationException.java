package factorymethod;

public class AnimalCreationException
    extends Exception
{
    public AnimalCreationException(final String    className,
                                   final Throwable cause)
    {
        super("Cannot create: " + className, cause);
    }
}

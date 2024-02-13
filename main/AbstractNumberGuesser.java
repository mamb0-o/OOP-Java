public abstract class AbstractNumberGuesser
    implements NumberGuesser
{
    public final int guess(final int min, final int max)
    {
        final int retVal;

        if(min > max)
        {
            throw new IllegalArgumentException(String.format("min (%d) must be <= max (%d)", min, max));
        }

        retVal = doGuess(min, max);

        return retVal;
    }

    protected abstract int doGuess(int min, int max);
}

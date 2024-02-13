package decorator;

public class Main
{
    public static void main(final String[] argv)
    {
        final Stringable foo;
        final Stringable upperFoo;
        final Stringable lowerFoo;

        foo = new Foo("HellO");
        upperFoo = new UpperDecorator(foo);
        lowerFoo = new LowerDecorator(foo);

        run(foo);
        run(upperFoo);
        run(lowerFoo);
    }

    public static void run(final Stringable value)
    {
        System.out.println(value.asString());
    }
}

package builder;

import java.awt.*;

public class FooBuilder
{
    private String name;
    private int age;
    private Color colour;

    public Foo build()
    {
        return new Foo(name, age, colour);
    }

    public FooBuilder withName(final String n)
    {
        name = n;

        return this;
    }

    public FooBuilder withAge(final int a)
    {
        age = a;

        return this;
    }

    public FooBuilder withColour(final Color c)
    {
        colour = c;

        return this;
    }
}

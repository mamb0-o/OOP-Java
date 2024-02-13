package builder;

import java.awt.*;

public class Main
{
    public static void main(final String[] argv)
    {
        final Foo foo1;
        final FooBuilder builder1;
        final Foo foo2;
        final Foo foo3;

        foo1 = new Foo("Vase", 1, Color.RED);

        builder1 = new FooBuilder();
        builder1.withColour(Color.RED);
        builder1.withName("Vase");
        builder1.withAge(1);
        foo2 = builder1.build();

        foo3 = new FooBuilder()
                .withColour(Color.RED)
                .withName("Vase")
                .withAge(1)
                .build();
    }
}

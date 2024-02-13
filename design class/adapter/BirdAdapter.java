package adapter;

import polymorphism.Animal;

public class BirdAdapter
    implements Animal
{
    private final Bird target;

    public BirdAdapter(final Bird bird)
    {
        target = bird;
    }

    @Override
    public void speak()
    {
        target.sing();
    }
}

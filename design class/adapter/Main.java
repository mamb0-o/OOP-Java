package adapter;

import polymorphism.Animal;

public class Main
{
    public static void main(final String[] argv)
    {
        final Animal animal;

        animal = new BirdAdapter(new Bird());

        speak(animal);
    }

    private static void speak(final Animal animal)
    {
        animal.speak();
    }
}

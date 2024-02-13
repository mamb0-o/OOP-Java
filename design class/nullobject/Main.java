package nullobject;

import polymorphism.Animal;

public class Main
{
    public static void main(final String[] argv)
    {
        final Animal animal;

        animal = new NullAnimal();
        speak(animal);
    }

    private static void speak(final Animal a)
    {
        a.speak();
    }
}

package abstractfactory;

import factorymethod.AnimalType;
import polymorphism.Animal;

public class Main
{
    public static void main(final String[] argv)
    {
        final AnimalFactory factory;
        final Animal        a;

        factory = makeAnimalFactory(false);
        a       = makeAnimal(AnimalType.CAT, "Terry", factory);
        speak(a);
    }

    private static AnimalFactory makeAnimalFactory(final boolean f)
    {
        final AnimalFactory factory;

        if(f)
        {
            factory = new VerboseAnimalFactory();
        }
        else
        {
            factory = new DefaultAnimalFactory();
        }

        return factory;
    }

    private static Animal makeAnimal(final AnimalType    type,
                                     final String        name,
                                     final AnimalFactory factory)
    {
        final Animal animal;

        animal = factory.createAnimal(type, name);

        return animal;
    }

    private static void speak(final Animal animal)
    {
        animal.speak();
    }
}

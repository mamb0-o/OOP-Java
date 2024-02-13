package factorymethod;

import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import polymorphism.Horse;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class Main
{
    public static void main(final String[] argv)
    {
        try
        {
            final Animal a;

            a     = createAnimal(argv[0], "Terry");
            speak(a);
        }
        catch(final AnimalCreationException ex)
        {
            ex.printStackTrace();
        }
    }

    private static void speak(final Animal animal)
    {
        animal.speak();
    }

    private static Animal createAnimal(final AnimalType type,
                                       final String     name)
    {
        final Animal animal;

        if(type == null)
        {
            throw new IllegalArgumentException("type cannot be null");
        }

        switch(type)
        {
            case CAT:
            {
                animal = new Cat(name);
                break;
            }
            case DOG:
            {
                animal = new Dog(name);
                break;
            }
            case HORSE:
            {
                animal = new Horse(name);
                break;
            }
            default:
            {
                throw new IllegalArgumentException(type + " is unknown");
            }
        }

        return animal;
    }

    private static Animal createAnimal(final String className,
                                       final String name)
            throws AnimalCreationException
    {
        try
        {
            final Class<? extends Animal> clazz;
            final Animal                  animal;

            clazz  = (Class<? extends Animal>)Class.forName(className);
            animal = createAnimal(clazz, name);

            return animal;
        }
        catch(final ClassNotFoundException ex)
        {
            throw new AnimalCreationException(className, ex);
        }
    }

    private static Animal createAnimal(final Class<? extends Animal> clazz,
                                       final String                  name)
            throws AnimalCreationException
    {
        try
        {
            final Constructor<? extends Animal> constructor;
            final Animal animal;

            constructor = clazz.getConstructor(String.class);
            animal      = constructor.newInstance(name);

            return animal;
        }
        catch(final NoSuchMethodException  |
                    IllegalAccessException |
                    InstantiationException |
                    InvocationTargetException ex)
        {
            throw new AnimalCreationException(clazz.getCanonicalName(), ex);
        }
    }
}

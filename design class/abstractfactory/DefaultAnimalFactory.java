package abstractfactory;

import factorymethod.AnimalType;
import polymorphism.Animal;
import polymorphism.Cat;
import polymorphism.Dog;
import polymorphism.Horse;

public class DefaultAnimalFactory
    implements AnimalFactory
{
    @Override
    public Animal createAnimal(final AnimalType type,
                               final String      name)
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
}

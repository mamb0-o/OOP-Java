package abstractfactory;


import factorymethod.AnimalType;
import polymorphism.Animal;


public interface AnimalFactory
{
    Animal createAnimal(AnimalType type,
                        String     name);
}

import java.util.ArrayList;

public class Cage 
{

    private ArrayList<Animal> animals;

    public Cage() 
    {
        animals = new ArrayList<Animal>();
        Animal randomAnimal = new Animal();
        animals.add(randomAnimal);
    }

    public Cage(Animal animal) 
    {
        animals = new ArrayList<Animal>();
        animals.add(animal);
    }

    public int getNumAnimals() 
    {
        return animals.size();
    }

    public Animal getAnimalAtIndex(int index) 
    {
        if (index >= 0 && index < animals.size())
        {
         return animals.get(index);
        }
        return null;
    }

    public void addAnimal(Animal animal) 
    {
      animals.add(animal);
    }

    public void removeAnimal(Animal animal) 
    {
      if (animals.contains(animal))
      {
         animals.remove(animal);
      }
    }

    @Override
    public String toString() 
    {
        return "Cage with " + animals.size() + " animals: " + animals;
    }
}
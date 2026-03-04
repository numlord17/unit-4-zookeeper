import java.util.ArrayList;

public class Zoo 
{

   private ArrayList<Cage> cages;

    public Zoo() 
    {
        cages = new ArrayList<Cage>();
        cages.add(new Cage());
        cages.add(new Cage());
        cages.add(new Cage());
    }

    public Zoo(int numCages) 
    {
        cages = new ArrayList<Cage>();
        for (int i = 0; i < numCages; i++)
        {
            cages.add(new Cage());
        }
    }

    public int howManyAnimals() 
    {
        return Animal.getAnimalCount();
    }

    public boolean putAnimalInCage(Cage cage, Animal animal) 
    {
        if (cages.contains(cage))
        {
            cage.addAnimal(animal);
            return true;
        }
        return false;
    }

    public boolean moveAnimal(Cage from, Cage to, Animal animal) 
    {
        if (cages.contains(from) && cages.contains(to))
        {
            for (int i = 0; i < from.getNumAnimals(); i++)
            {
               if (from.getAnimalAtIndex(i) == animal)
               {
                  from.removeAnimal(animal);
                  to.addAnimal(animal);
                  return true;
               }
            }
        }
        return false;
    }

    public ArrayList<Cage> getCages() 
    {
        return cages;
    }

    public Cage getCageAtIndex(int index) 
    {
        if (index >= 0 && index < cages.size())
        {
         return cages.get(index);
        }
        return null;
    }

    public String toString() 
    {
        String returnString = "";
        returnString += "ZOO CONTENTS:\n";
        returnString += "CAGE1: " + getCageAtIndex(0) + "\n";
        returnString += "CAGE2: " + getCageAtIndex(1) + "\n";
        returnString += "CAGE3: " + getCageAtIndex(2) + "\n";
        return returnString;
    }

    public static void main(String[] args) 
    {
        // Create a zoo with default constructor
        Zoo zoo = new Zoo();
        // Demonstrate howManyAnimals
        System.out.println(zoo.getCageAtIndex(0).getNumAnimals());
        Animal monkey = new Animal("Monkey");
        zoo.getCageAtIndex(0).addAnimal(monkey);
        System.out.println(zoo.getCageAtIndex(0).getAnimalAtIndex(0).speak());
        System.out.println(zoo.getCageAtIndex(0).getAnimalAtIndex(1).speak());
        // Try adding a new animal into cage 0
        System.out.println(zoo);
        // Move an animal from one cage to another
        
        // Move an animal from one cage to a cage that doesn't exist in this Zoo and see what gets
        // returned from moveAnimal
        
        // Try adding to a cage that does NOT belong to this zoo
        
        // Speak demo
        
    }
}
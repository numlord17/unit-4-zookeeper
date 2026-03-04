import java.util.ArrayList;

public class Animal 
{

    private String animalType;
    private static int animalCount = 0;
    private static final String[] TYPES = 
    {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };

    public Animal() 
    {
        int randomAnimal = (int) (Math.random() * 8);
        animalType = TYPES[randomAnimal];
        animalCount++;
    }

    public Animal(String type) 
    {
        animalType = type;
        animalCount++;
    }

    public String getAnimalType() 
    {
        return animalType;
    }

    public static int getAnimalCount() 
    {
        return animalCount;
    }

    public String speak() 
    {
        switch (animalType)
        {
         case "Lion":
            return "Roar";
         case "Bear":
            return "Grr";
         case "Elephant":
            return "Honk";
         case "Giraffe":
            return "Stretch";
         case "Zebra":
            return "Neigh";
         case "Penguin":
            return "Whee";
         case "Snake":
            return "Hiss";
         case "Monkey":
            return "Oo Oo";
         default:
            return "";
        }
    }

    private static String randomAnimalType() 
    {
      return TYPES[(int) (Math.random() * 8)];
    }

    public String toString() 
    {
        return animalType;
    }
}
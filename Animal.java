import java.util.ArrayList;

public class Animal {

    // ===== Instance Variables =====
    private String animalType;

    // ===== Static Variables =====
    private static int animalCount = 0;

    // Optional: a fixed menu of animal types to choose from
    private static final String[] TYPES = {
        "Lion", "Bear", "Elephant", "Giraffe", "Zebra", "Penguin", "Snake", "Monkey"
    };

    // ===== Constructors =====

    /**
     * No-arg constructor:
     * REQUIRED: choose a random animal type
     * REQUIRED: increment animalCount
     */
    public Animal() {
        // TODO: set animalType to a random type from TYPES
        int randomAnimal = (int) (Math.random() * 8);
        animalType = TYPES[randomAnimal];
        // TODO: increment animalCount
        animalCount++;
    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        animalType = type;
        // TODO: increment animalCount
        animalCount++;
    }

    // ===== Getters / Setters =====

    public String getAnimalType() {
        return animalType;
    }

    // ===== Class-level getter =====
    public static int getAnimalCount() {
        return animalCount;
    }

    // ===== Behaviors =====

    /**
     * REQUIRED: returns a sound based on animalType.
     * You may choose your own sounds; keep it consistent.
     */
    public String speak() {
        // TODO: return a sound depending on animalType
        // Example idea:
        // if (animalType.equals("Lion")) return "Roar!";
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

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private static String randomAnimalType() {
      return TYPES[(int) (Math.random() * 8)];
    }

    public String toString() {
        return "";
    }
}
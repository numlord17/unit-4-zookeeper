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
        // TODO: increment animalCount
    }

    /**
     * Parameterized constructor:
     * REQUIRED: set animalType to type
     * REQUIRED: increment animalCount
     */
    public Animal(String type) {
        // TODO: set animalType
        // TODO: increment animalCount
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
        return "";
    }

    /**
     * OPTIONAL helper: return a random animal type from TYPES.
     */
    private static String randomAnimalType() {
    }

    public String toString() {
        return "";
    }
}
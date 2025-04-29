/**
 * Class representing cow with variables for name, age, and weight
 * @author Richard Gao
 * @version 1.0.0
 */
public class Cow {
    private String name;
    private int age;
    private double weight;

    /** 
     * Creates instance of Cow class with given name, age, and weight
     * @param name String representing name of the cow
     * @param age int representing age of the cow
     * @param weight double representing weight of the cow
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Gets the name of the cow
     * @return String representing the name of the cow
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the age of the cow
     * @return int representing the age of the cow
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Gets the weight of the cow
     * @return double representing the weight of the cow
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Represents the cow instance as a String.
     * 
     * String is formatted "name, age - weight"
     * @return String representation of the cow instance
     */
    @Override
    public String toString() {
        return getName() + ", " + getAge() + " - " + getWeight();
    }

    /**
     * Checks if two cow instances are equal.
     * 
     * Two cows are considered equal if their name, age, and weight all match
     * @return true if both cows are equal, false if cows are not equal or compared instance is not a cow
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Cow cow = (Cow) obj;
        return getName().equals(cow.getName()) && getAge() == cow.getAge() && getWeight() == cow.getWeight();
    }
}

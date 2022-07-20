//Пункт 1
public class Animal {
    // public static Animal tiger;
    //public Animal lion;
    //  Свойства объекта
    private int theWeight;
    private int age;
    private String colour;
    private String name;
    private boolean isAlive;

    public Animal(int theWeight, int age, String colour, String name, boolean isAlive) {
        this.theWeight = theWeight;
        this.age = age;
        this.colour = colour;
        this.name = name;
        this.isAlive = isAlive;
    }
    public Animal() {
        theWeight = 10;
        age = 5;
        colour = "black";
        name = "kiwi";
        isAlive = true;
    }
    public Animal(boolean isAlive) {
        this.isAlive = isAlive;
    }
    //  get/set для свойств объекта
    public int getTheWeight() {
        return theWeight;
    }

    public void setTheWeight(int theWeight) {
        this.theWeight = theWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    protected String voice() {
        return "Hello";

    }

    @Override
    public String toString() {
        return "Animal{" +
                " theWeight=" + theWeight +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", name='" + name + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
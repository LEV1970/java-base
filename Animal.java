package lesson6.hw;

public abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract void run (int length);
    public abstract void swim (int length);
}

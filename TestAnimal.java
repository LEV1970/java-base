package lesson6.hw;

import java.util.concurrent.Callable;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька");
        cat.run(201);
        cat.swim(10);
        Cat cat1 = new Cat("Мурзик");
        cat1.run(150);
        Dog dog = new Dog("Тузик");
        dog.run(500);
        dog.swim(10);
    }
}

package lesson7.hw;

public class TestFood {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Васька", 30), new Cat("Барсик", 20),
                new Cat("Мурзик", 25), new Cat("Матроскин", 10),
                new Cat("Леопольд", 20)};
        Plate p = new Plate( 50);
        p.addFood(50);
        p.info();
        for (Cat cat : cats) {
            cat.eat(p);
            cat.info();
        }
        p.info();
    }
}

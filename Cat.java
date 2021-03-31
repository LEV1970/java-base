package lesson6.hw;

public class Cat extends Animal{
    private final int MAX_RUN = 200;
    public Cat (String name) {
        super(name);
    }
    @Override
    public void run(int lenght) {
        if (( lenght > 0) && ( lenght <= MAX_RUN))
        System.out.println("Кот " + name + " пробежал " + lenght + " метров");
        if (lenght > MAX_RUN)
            System.out.println("Кот " + name + " пробежал " + MAX_RUN + " метров и отдыхает");
        if (lenght <= 0)
            System.out.println("Кот " + name + " сегодня еще не бегал");}
    @Override
    public void swim(int lenght) {
        System.out.println("Коты не умеют плавать");
    }
}

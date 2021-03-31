package lesson6.hw;

public class Dog extends Animal{
    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    public Dog (String name){
        super(name);
    }
    @Override
    public void run(int lenght) {
        if (( lenght > 0) && ( lenght <= MAX_RUN))
        System.out.println("Собака " + name + " пробежала " + lenght + " метров");
        if (lenght > MAX_RUN)
            System.out.println("Собака " + name + " пробежала " + MAX_RUN + " метров и отдыхает");
        if (lenght <= 0)
            System.out.println("Собака " + name + " сегодня еще не бегала");}
    @Override
    public void swim(int lenght) {
        if (( lenght > 0) && ( lenght <= MAX_SWIM))
            System.out.println("Собака " + name + " проплыла " + lenght + " метров");
        if (lenght > MAX_SWIM)
            System.out.println("Собака " + name + " проплыла " + MAX_SWIM + " метров и отдыхает");
        if (lenght <= 0)
            System.out.println("Собака " + name + " сегодня еще не плавала");}
}

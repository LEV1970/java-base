package lesson7.hw;

public class Cat {private String name;
    private int appetite;
    private boolean hungry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }
    public void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println("Кот " + name + ": " + isHungry);
    }
    public void eat(Plate p) {
        if (hungry && p.decreaseFood(appetite))
            hungry = false;
    }
}

package lesson7.hw;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
        food -= n;
        return true;
    }
    public void addFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println("Кол-во еды в тарелке: " + food);
    }
}

package Interfaces.HW;

public class Cook implements Driver, Worker{
    @Override
    public void drive() {
        System.out.println("Повар водит");
    }

    @Override
    public void work() {
        System.out.println("Повар работает");
    }
}

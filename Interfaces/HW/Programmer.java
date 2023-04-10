package Interfaces.HW;

public class Programmer implements Driver, Worker{
    @Override
    public void drive() {
        System.out.println("Программист водит");
    }

    @Override
    public void work() {
        System.out.println("Программист работает");
    }
}

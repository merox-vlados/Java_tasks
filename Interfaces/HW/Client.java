package Interfaces.HW;

public class Client {

    public void makeOrder(Waiter waiter, String dish) {
        waiter.bringOrder(dish);
    }
}

package Interfaces.HW;

public class WaiterBob implements Waiter{
    @Override
    public void bringOrder(String dish) {
        System.out.println("Приносит заказ: " + dish);
    }
}

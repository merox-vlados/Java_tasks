package Interfaces.HW;

import Java_training.Array;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String dish) {
                System.out.println("Приносит заказ " + dish);
            }
        }, "Рыба");



    }
}

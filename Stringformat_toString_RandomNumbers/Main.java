package Stringformat_toString_RandomNumbers;

import OOP.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 0;
        for (int i = 0; i < 100; i++) {
            a = random.nextInt(5,11);
            System.out.print(a + " ");
        }

    }

}

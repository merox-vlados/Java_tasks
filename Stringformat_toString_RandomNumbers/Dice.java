package Stringformat_toString_RandomNumbers;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int a = random.nextInt(1,7);
            System.out.println(String.format("Ваше число: %s", a));
        }

    }



}

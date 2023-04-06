package Java_training;

public class WhatToDoHW {

    public static void main(String[] args) {
        int time = 21;
        boolean isGoodWeather = true;
        boolean isNight = time >= 22 || time < 6;

        if (isGoodWeather && !isNight) {
            System.out.println("Гулять");
        } else if (!isGoodWeather && !isNight) {
            System.out.println("Читать книгу");
        } else if (isNight) {
            System.out.println("Спать");
        }

    }
}

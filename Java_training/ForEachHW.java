package Java_training;

public class ForEachHW {
    public static void main(String[] args) {
        int number = 100;
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = number++;
        }
        for (int value: numbers) {
            System.out.println(value);
        }

    }
}

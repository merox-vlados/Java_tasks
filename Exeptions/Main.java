package Exeptions;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            int b = array[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элемент отсутвует в массиве");
        }
    }
}

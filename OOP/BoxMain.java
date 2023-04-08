package OOP;

public class BoxMain {

    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);

        Box box2 = new Box(20,20,20);

        Box box3 = new Box(30);

        box1.showVolume();

        double volume2 = box2.getVolume();
        System.out.println(volume2);

        box3.showVolume();

        System.out.println("Сравнение коробок:");
        Box current = new Box(20);
        Box another = new Box(20);
        int result = current.compare(another);
        System.out.println(result);


        System.out.println("Коробка в параметре конструктора");
        Box current1 = new Box(10);
        Box another1 = new Box(current1);
        another1.setDimens(20,20,20);
        current1.showVolume();
        another1.showVolume();

        System.out.println("Копия коробки:");

        Box original = new Box(15);
        Box copyBox = original.copy();

        original.showVolume();
        copyBox.showVolume();

        System.out.println("Увеличение коробки в 2 раза:");

        Box smallBox = new Box(10);
        Box increaseBox = smallBox.increase();

        smallBox.showVolume();
        increaseBox.showVolume();






    }
}

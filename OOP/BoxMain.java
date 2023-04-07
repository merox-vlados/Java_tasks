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





    }
}

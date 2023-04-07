package OOP;

public class Dog {
    String name;
    String breed;

    double weight;

    int speed;

    String getInfo() {
        String str = "Имя: " + name + ", порода: " + breed + ", вес: " + weight;

        return str;
    }

    void Run () {
        for (int i = 0; i < speed; i++) {
            System.out.println("Бегу");
        }
    }



}

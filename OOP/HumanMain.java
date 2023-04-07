package OOP;

public class HumanMain {
    public static void main(String[] args) {
        Human John = new Human();

        John.name = "John";
        John.age = 18;
        John.weight = 77;

        Human Sam = new Human();

        Sam.name = "Sam";
        Sam.age = 23;
        Sam.weight = 82;

        Human Ramin = new Human();

        Ramin.name = "Ramin";
        Ramin.age = 25;
        Ramin.weight = 65;

        double sum = John.age + Sam.age + Ramin.age;

        double averageAge = sum / 3;

        System.out.println(averageAge);
    }
}

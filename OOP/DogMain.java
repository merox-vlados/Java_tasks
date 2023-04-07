package OOP;

public class DogMain {

    public static void main(String[] args) {

        Dog Bobby = new Dog();
        Bobby.name = "Bobby";
        Bobby.breed = "yard";
        Bobby.weight = 5.7;
        Bobby.speed = 4;

        System.out.println(Bobby.getInfo());

        Bobby.Run();
    }
}

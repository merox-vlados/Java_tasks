package OOP;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.setAge(21);
        System.out.println("Name: " + person.getName() + " Age: " + person.getAge());
    }
}

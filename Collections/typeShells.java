package Collections;

import OOP.Person;

public class typeShells {
    public static void main(String[] args) {
        String s = "This is John. He is 27 years old.";
        String name = s.substring(8,12);
        String strAge = s.substring(20,22);
        int age = Integer.parseInt(strAge);

        Person person = new Person(name,age);
        System.out.println("Name: " + person.getName() + " age: " + person.getAge());


    }
}

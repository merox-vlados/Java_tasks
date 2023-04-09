package Collections;

import OOP.Person;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList <String> employees = getEmployees();
        employees.add("James");
        employees.remove("Emma");
        for (String employee : employees) {
            System.out.println(employee);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        for(int number : numbers) {
            System.out.println(number);
        }

    }

    private static ArrayList <String> getEmployees() {
        ArrayList <String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}

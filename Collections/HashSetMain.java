package Collections;


import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet <String> names = getEmployees();
        for(String name : names) {
            System.out.println(name);
        }

    }
    private static HashSet<String> getEmployees() {
        HashSet <String> employees = new HashSet<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}

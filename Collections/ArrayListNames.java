package Collections;

import java.util.ArrayList;

public class ArrayListNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mia");
        names.add("Lolly");
        names.add("Brown");
        names.add("Nick");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<String> numbersAndNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            numbersAndNames.add(numbers.get(i) + " - " + names.get(i));
        }

        for (String str : numbersAndNames) {
            System.out.println(str);
        }

    }
}

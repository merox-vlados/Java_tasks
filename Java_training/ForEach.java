package Java_training;

public class ForEach {
    public static void main(String[] args) {
        String[] namesOfStudents = {
                "Rodion",
                "Ramin",
                "Max",
                "Arina",
                "Vasily"
        };
//        for (int i = 0; i < namesOfStudents.length; i++) {
//            System.out.p rintln(namesOfStudents[i]);
//        }
        for (String name : namesOfStudents) {
            System.out.println(name);
        }
    }
}

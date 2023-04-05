package Java_training;
public class VariableHomeWork {
    public static void main(String[] args) {
        int days = 10000;
        int years = days / 365;
        int month = (days % 365) / (365/12);
        int day = ((days % 365) % (365/12));
        System.out.println("Лет: " + years);
        System.out.println("Месяцов: " + month );
        System.out.println("Дней: " + day);


    }
}

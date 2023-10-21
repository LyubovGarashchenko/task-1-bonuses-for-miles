public class Main {
    public static void main(String[] args) {
        System.out.println("Расчёт авиабонусов милями за перелёты");

        int amount = 5000; // средняя стоимость билета
        System.out.println("Средняя стоимость билета - 5000 рублей");
        int one_mile = 20; // за каждые 20 рублей начисляется 1 миля
        System.out.println("1 миля = 20 рублей");
        int bonus = amount / one_mile;

        System.out.println("Количество бонусных миль: " + bonus + "  " + "бонусных миль");
    }
}
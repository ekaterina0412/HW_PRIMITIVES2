public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int account = 100;
        int sum = 300;
        int bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (sum > 1000) {
            bonus = sum / 100;
        } else {
            bonus = 0;
        }
        account = account + sum + bonus;
        System.out.println("Итоговый счет: " + account + ". Бонусных рублей: " + bonus);
    }
}

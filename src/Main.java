public class Main {
    public static void main(String[] args) {
        int current_balance = 100;
        int replenishment = 1100;
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100; // Вычисляем бонусные рубли
        }

        int total_balance = current_balance + replenishment+ bonus ;

        System.out.println("Итоговая сумма на счету клиента: " + total_balance );
        System.out.println("Количество бонусных рублей: " + bonus );
    }
}
public class Main {
    public static void main(String[] args) {
        //фиксированные переменные в рублях
        int bonus = 1;
        int bonus_rub = 100;
        int min_payment = 1000;
        //пользовательские переменные в рублях с копейками
        int personal_account = 10000;
        int payment = 110000;
        int bonus_sum = ((int) (payment / 100) / bonus_rub) * bonus;
        if (payment / 100 < min_payment) {
            bonus_sum = 0;
        }
        int total_amount = personal_account / 100 + payment / 100 + bonus_sum;
        System.out.println(bonus_sum);
        System.out.println(total_amount);
    }
}


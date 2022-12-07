public class Main {
    public static void main(String[] args) {
//        Условие
// Один из сотовых операторов решил сделать своим клиентам приятный бонус:
// если клиент пополняет счёт более чем на 1000 рублей,
// то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
//        Ваша задача
//Создать приложение, выводящее итоговый счёт и количество бонусных рублей.
// Количество денег на текущем счету клиента и сумму пополнения вы выбираете сами —
// сами создайте переменные, в которых эти данные будут храниться.

        int initialAmount = 100;
        int addedAmount = 1100;


        if (addedAmount < 1001) {
            int totalAmount = initialAmount + addedAmount;
            System.out.println("Спасибо! На Вашем счету " + totalAmount + " рублей");
        } else {
            int bonus = addedAmount / 100;
            int totalAmount = initialAmount + addedAmount + bonus;
            System.out.println("Спасибо! Вы получили бонусные рубли и на Вашем счету " + totalAmount + " рублей");
        }

    }
}
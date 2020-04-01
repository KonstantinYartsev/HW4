package HW3;

public class Calculation {
    /**
     * Метод рассчета скидки, взависимости от зарпалты в час.
     * Чем больше зарплата - тем меньше скидка
     *
     * @param salary - зарплата
     * @return скидка в процентах
     * @throws MyException - если переданно отрицательное значение зарплаты
     */
    public static double discount(double salary) throws MyException{
        double discount = 0;
        if (salary < 0){
            throw new MyException ("Переданна отрицательная зарплата!");
        }
        else {
            if (salary <= 5.0) {
                discount = 30;
            } else if (salary <= 12.0) {
                discount = 20;
            } else if (salary <= 15.0) {
                discount = 15;
            }
        }
        System.out.printf("Скидка составляет %.0f%%\n", discount);

        return discount;
        // Посчитайте скидку с разными параметрами. Выведите корректную скидку на экран.

    }

    /**
     * Метод рассчета стоимости билета со скидкой.
     * Для рассчета скидки, используйте метод discount
     *
     * @param ticketPrice - стоимость билета
     * @param discount - скидка
     * @return стоимость билета со скидкой
     */
    public static double countTicketPrice(int ticketPrice, double discount) throws MyException {
        double maxDiscount = 45;
        if(discount > maxDiscount || discount < 0){
            throw new MyException ("Переданна неверная скидка!");
        }
        if(ticketPrice < 0){
            throw  new MyException("Передана отрицательная цена!");
        }
        return ticketPrice - ticketPrice*(discount/100);
    }
    // Метод должен корректно считать окончательную стоимость билета
}

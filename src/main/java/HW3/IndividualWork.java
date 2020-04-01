package HW3;

public class IndividualWork {

    /**
     * Метод вывода таблицы умножения 10х10
     */
    public void table() {

        int[][] multiplyTab  = new int[10][10];

        for (int multiplicand = 0; multiplicand < 10; multiplicand++) {
            for (int multiplier = 0; multiplier < 10; multiplier++) {
                multiplyTab[multiplicand][multiplier] = (multiplicand+1)*(multiplier+1);
                //вывод ряда чисел разделенных знаком табуляции
                System.out.printf("%4d", multiplyTab[multiplicand][multiplier]);
            }
            System.out.println();
        }
    }


    // Реализовать метод вывода таблицы умножения 10x10 используя циклы
    // Числа разделять пробелами.

    // Пример вывода:
    // 1 2 3 4 5 6 7 8 9 10
    // 2 4 6 8 10 12 14 16 18 20
    // И т.д.


    /**
     * HARD MODE - ON
     * Метод подсчета нахождение автобуса в определенное время
     *
     * @param time - число, означающее время, прошедшее сначала часа
     * @return string - улица, на которой едет автобус в текущее время
     */
    public String bus(double time) {
        String one = "Комсомольская";
        String two = "Ленина";
        String three = "Тимирязевская";
        time = Math.abs(time);
        if(time > 60) {
            time %= 60;
        }
        if(time > 56) {
            return one;
        }else if(time > 14) {
            time %= 14;
        }
        if(time < 9){
            return one;
        }else if(time < 12){
            return two;
        }else {
            return three;
        }
    }
//  Автобус едет по маршруту, вначале каждого часа, в течение 8 минут он проезжает улицу "Комсомольская",
//  затем в течение следующих 3-х минут проезжает улицу "Ленина",
//  а потом в течение 3-х минут проезжает улицу "Тимирязевская", далее автобус возвращается на начало маршрута.
//  метод должен принимать в себя число, означающее время, прошедшее сначала часа. Определить, на какой улице едет автобус в переданное время

// Например передали число 16.5. Ответ - Комсомольская
// Число 9 - Ленина
}



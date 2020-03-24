import Constants.CalculationConstants;
import HW3.Calculation;
import HW3.MyException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TestCalculation {
    @Test(expectedExceptions = MyException.class)
    public static void testCalculation() throws MyException {
        String s = "Метод countElementsInMap класса Map работает без ошибок\n";

        for (CalculationConstants t : CalculationConstants.values()) {
            System.out.printf("//Исходные данные: %.2f || Ожидаемый результат: %.0f%n",
                    t.getTestSalary(), t.getExpectedDiscount());
            Assert.assertEquals(Calculation.discount(t.getTestSalary()),t.getExpectedDiscount(),"Тест не пройден");
        }

        System.out.printf("%.2f\n",Calculation.countTicketPrice(101, 200));
        System.out.printf("%.2f\n",Calculation.countTicketPrice(101, 0.005));
        System.out.printf("%.2f\n",Calculation.countTicketPrice(-101, 10));
        System.out.printf("%.2f\n",Calculation.countTicketPrice(101, -10));

        Assert.assertNotEquals(Calculation.countTicketPrice(101, -10), 111.00, 0.00, "Метод принемает отрецательную скидку!");
    }
}

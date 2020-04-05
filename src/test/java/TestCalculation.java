import Constants.TestCalculatorLocalesData;
import HW3.Calculation;
import HW3.MyException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculation {
    @Test(groups = { "group-one" },
            dataProvider = "CandidateDiscountLD",dataProviderClass = TestCalculatorLocalesData.class)
    public void testCalculationDiscount(double salary, double expectedDiscount)  {

        System.out.printf("//Исходные данные: %.2f || Ожидаемый результат: %.0f%n",
                    salary, expectedDiscount);
        try {
                Assert.assertEquals(Calculation.discount(salary),expectedDiscount,"Тест не пройден");
        } catch (MyException e) {
            System.out.println("Тест не пройден! "+e.toString());
        }
        System.out.println("Тест пройден успешно!");
    }

    @Test(groups = { "group-one" },expectedExceptions = MyException.class,
            dataProvider = "NegativeCalculatorDiscountLD",dataProviderClass = TestCalculatorLocalesData.class)
    public void negativeTestCalculationDiscount(double salary, double expectedDiscount) throws MyException {
        System.out.printf("//Исходные данные: %.2f || Ожидаемый результат: %.0f%n",
                salary, expectedDiscount);
        Assert.assertEquals(Calculation.discount(salary),expectedDiscount,"Тест не пройден!");
        System.out.println("Тест пройден успешно!");
    }

    @Test(dataProvider = "CalculatorCountTicketPriceLD",dataProviderClass = TestCalculatorLocalesData.class)
    public void TestCalculationCountTicketPrice(int ticketPrice, double discount, double expectedResultPrice) {
        System.out.printf("//Исходные данные: %d, %.0f%% || Ожидаемый результат: %.0f%n ",
                ticketPrice, discount,expectedResultPrice);
        try {
            Assert.assertEquals(Calculation.countTicketPrice(ticketPrice, discount), expectedResultPrice,"Тест не пройден!");
        } catch (MyException e) {
            System.out.println("Тест не пройден! "+e.toString());
        }
        System.out.println("Тест пройден успешно!");
    }

    @Test(expectedExceptions = MyException.class,
            dataProvider = "NegativeCalculatorCountTicketPriceLD",dataProviderClass = TestCalculatorLocalesData.class)
    public void negativeTestCalculationCountTicketPrice(int ticketPrice, double discount, double expectedResultPrice) throws MyException {
        System.out.printf("//Исходные данные: %d, %.0f%% ",
                ticketPrice, discount);
        Assert.assertNotEquals(Calculation.countTicketPrice(ticketPrice, discount), expectedResultPrice);
    }
}

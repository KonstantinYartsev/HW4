package Constants;

import org.testng.annotations.DataProvider;

public class TestIndividualWorkLocalesData {
    @DataProvider(name = "IndividualWorkBusLD")
    public static Object[][] getIndividualWorkBusLD() {
        return new Object[][]{
                {16.5, "Комсомольская"},
                {9, "Ленина"},
                {73, "Тимирязевская"},
                {-9, "Ленина"}
        };
    }
    @DataProvider(name = "NegativeCalculatorDiscountLD")
    public static Object[][] getNegativeCalculatorLD() {
        return new Object[][]{{-1, 0}};
    }
}

package Constants;

import org.testng.annotations.DataProvider;

public class TestCalculatorLocalesData {

    @DataProvider(name = "CandidateDiscountLD")
    public static Object[][] getCalculatorDiscountLD() {
        return new Object[][]{
                {0.00, 30},
                {0.01, 30},
                {4.99, 30},
                {5.00, 30},
                {11.99, 20},
                {12.00, 20},
                {12.01, 15},
                {14.99, 15},
                {15.00, 15},
                {15.01, 0}
        };
    }
    @DataProvider(name = "NegativeCalculatorDiscountLD")
    public static Object[][] getNegativeCalculatorLD() {
        return new Object[][]{{-1, 0}};
    }
    @DataProvider(name = "CalculatorCountTicketPriceLD")
    public static Object[][] getCalculatorCountTicketPriceLD() {
        return new Object[][]{
                {100, 5, 95},
                {100, 10, 90},
                {100, 45, 55}
        };
    }
    @DataProvider(name = "NegativeCalculatorCountTicketPriceLD")
    public static Object[][] getNegativeCalculatorCountTicketPriceLD() {
        return new Object[][]{
                {-100, 10, -90},
                {100, 200, -100},
                {100, -10, 110},
        };
    }

//    {new Double[] {0.00, 30.0}},
//    {new Double[] {0.01, 30.}},
//    {new Double[] {4.99, 30.}},
//    {new Double[] {5.00, 30.}},
//    {new Double[] {11.99, 20.}},
//    {new Double[] {11.99, 20.}},
//    {new Double[] {12.00, 20.}},
//    {new Double[] {12.01, 15.}},
//    {new Double[] {14.99, 15.}},
//    {new Double[] {15.00, 15.}},
//    {new Double[] {15.01, 0.}},
//    {new Double[] {-1., 0.}}
}
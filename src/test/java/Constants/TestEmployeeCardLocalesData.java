package Constants;

import org.testng.annotations.DataProvider;

public class TestEmployeeCardLocalesData {
    @DataProvider(name = "TestEmployeeCardLD")
    public static Object[][] getTestEmployeeCardToStringLD() {
        return new Object[][]{
                {"Антон", 28, 155, 15.5, false, "Имя работника - Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - Мужской."},
                {"Александа", 30, 165, 16.5, true, "Имя работника - Александа. Его возраст - 30 лет. Его зарплата - 16.5 в час. Пол - Женский."}
        };
    }
    //Имя работника - Антон. Его возраст - 28 лет. Его зарплата - 15.5 в час. Пол - мужской.
    //Имя работника - " + name + ". Его возраст - " + age + " лет. Его зарплата - " + salary + " в час. Пол - " + sex
}

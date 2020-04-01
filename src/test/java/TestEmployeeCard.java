import Constants.TestEmployeeCardLocalesData;
import HW3.EmployeeCard;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeCard {
    @Test(dataProvider = "TestEmployeeCardLD",dataProviderClass = TestEmployeeCardLocalesData.class)
    public static void testEmployeeCard(String name, int age, double effective, double salary, boolean isWoman, String s){
        EmployeeCard employeeCard = new EmployeeCard(name, age, effective, isWoman);
        Assert.assertEquals(employeeCard.toString(), s, "Тест не пройден!");
        employeeCard = new EmployeeCard(name, age, effective,salary, isWoman);
        Assert.assertEquals(employeeCard.toString(), s, "Тест не пройден!");
        System.out.println("Тест пройден!");
    }
}

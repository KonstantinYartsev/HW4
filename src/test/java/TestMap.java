import Constants.TestMapLocalesData;
import HW2.Map;
import HW2.Sort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TestMap {


    @Test(dataProvider = "CountElementsInMapLD", dataProviderClass = TestMapLocalesData.class)
    public void testCountElementsInMap(HashMap map,String testLastName, String testFirstName, int expectedCount) {
        System.out.printf("//Исходные данные: %s %s || Ожидаемый результат: %d%n",
                testLastName, testFirstName, expectedCount);
        int i = Map.countElementsInMap(map,testLastName,testFirstName);
        Assert.assertEquals(i,expectedCount, "Тест не пройден!");
        System.out.println("Полученый результат: " + i);
        System.out.println("Тест пройден!");
    }
    @Test(dataProvider = "DeleteValueFromMapLD", dataProviderClass = TestMapLocalesData.class)
    public void testDeleteValueFromMap(String testLastName, String testFirstName, int expectedCount) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        Map m = new Map();

        System.out.printf("//Исходные данные: %s %s || Ожидаемый результат: %d%n",
                testLastName, testFirstName, expectedCount);
        Map.deleteValueFromMap(map,testLastName,testFirstName);
        Assert.assertEquals(Map.countElementsInMap(map,testLastName,testFirstName),expectedCount, "Тест не пройден!");
        System.out.println("Полученый результат: " + map.toString());
        System.out.println("Тест пройден!");
    }
}

import Constants.TestSortLocalData;
import HW2.Sort;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestSort {
    @Test(dataProvider = "SortDiscountLD", dataProviderClass = TestSortLocalData.class)
    public void testSort(int[] testArray, int[] expectedArray) {

        System.out.printf("//Исходный массив: %s || Ожидаемый результат: %s \n",
                Arrays.toString(testArray), Arrays.toString(expectedArray));
        testArray = Sort.reverseSort(testArray);
        System.out.println("Полученый результат: " + Arrays.toString(testArray));
        Assert.assertTrue(Arrays.equals(testArray, expectedArray), "Тест не пройден!");
        System.out.println("Тест пройден!");
    }

}

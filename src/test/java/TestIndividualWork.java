import Constants.TestIndividualWorkLocalesData;
import HW3.IndividualWork;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIndividualWork {
    IndividualWork individualWork = new IndividualWork();
    @Test(dataProvider = "IndividualWorkBusLD",dataProviderClass = TestIndividualWorkLocalesData.class)
    public void testIndividualWorkBus(double time, String expectedResult){
        System.out.printf("//Исходные данные: %.2f минут || Ожидаемый результат: %s%n ",
                time, expectedResult);
        Assert.assertEquals(individualWork.bus(time),expectedResult,"Тест не пройден!");

        System.out.println("Тест пройден!");
    }
    @Test
    public void testIndividualWorkTable(){
        individualWork.table();
    }
}

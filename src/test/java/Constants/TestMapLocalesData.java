package Constants;

import org.testng.annotations.DataProvider;

import java.util.HashMap;

public class TestMapLocalesData {
    @DataProvider(name = "CountElementsInMapLD")
    public static Object[][] getCountElementsInMapLD() {
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
        return new Object[][]{
                {map,"Дмитров", "Алексей", 1},
                {map,"Ерохин", "Сергей ", 3},
                {map,"ЯрМоЛов", "Алексей", 1},
                {map,"Дмитрий", "Красеев", 0},
                {map," Ерохин", "Сергей", 3},
                {map,"Андреев ", "Андрей ", 2},
                {map,"Смирнов", "Владиmир", 0},
                {map,"", "", 0},
                {map,"Андреев", "Андрей", 2},
                {map,new String("Дмитров"), new String("Алексей"), 1},
                {map,null, null, 0}
        };
    }
    @DataProvider(name = "DeleteValueFromMapLD")
    public Object[][] getDeleteValueFromMapLD(){
        return new Object[][]{
                {"Дмитров", "Алексей", 0},
        };
    }
}

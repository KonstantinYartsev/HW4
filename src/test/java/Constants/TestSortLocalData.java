package Constants;

import org.testng.annotations.DataProvider;

public class TestSortLocalData {
    @DataProvider(name = "SortDiscountLD")
    public static Object[][] getSortLD() {
        return new Object[][]{
                {new int[]{}, new int[]{}},
                {new int[]{1}, new int[]{1}},
                {new int[]{-10,5,0,-2,4,-100,0,5}, new int[]{5,5,4,0,0,-2,-10,-100}},
                {new int[]{-2,-1,0,1,2,3,4}, new int[]{4,3,2,1,0,-1,-2}},
                {new int[]{1,1,1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,1,1}},
                {new int[]{9,8,7,6,5,4,3,2,1}, new int[]{9,8,7,6,5,4,3,2,1}}
        };
    }
}

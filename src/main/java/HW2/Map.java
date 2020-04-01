package HW2;

import java.util.HashMap;

public class Map {

    /**
     * Метод подсчета одинаковых элементов в HashMap, поиск производится по фамилии и имени
     *
     * @param lastName - фамилия для проверки
     * @param firstName - имя для проверки
     * @return int - количество одинаковых элементов в HashMap
     */
    public static int countElementsInMap(HashMap<String,String> map,String lastName, String firstName) {

        int count = 0;
        if ( lastName != null && firstName != null ) {
            for (HashMap.Entry<String, String> hashMap : map.entrySet()) {
                if (hashMap.getKey().trim().equalsIgnoreCase(lastName.trim()) && hashMap.getValue().trim().equalsIgnoreCase(firstName.trim()))
                    count++;
            }
        }
        return count;
        // Передать фамилию и имя человека в метод
        // Найти и вернуть наибольшее количество совпадений имени и фамилии
    }


    /**
     * Метод удаления определенного элемента из HashMap
     *
     * @param map   - HashMap с наполненными данными
     * @param key   - значение, поиск по которому будет производится
     * @param value - значение, поиск по которому будет производится
     */
    public static void deleteValueFromMap(HashMap<String, String> map, String key, String value) {
        map.entrySet().removeIf(entry -> entry.getKey().equals(key) && entry.getValue().equals(value));
    }
}
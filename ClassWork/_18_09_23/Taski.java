package ClassWork._18_09_23;

import java.util.HashMap;
import java.util.Map;

public class Taski {
//    Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
//    Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
//    Переберите только значения в HashMap и TreeMap и найдите их среднее значение.
//    Переберите HashMap и найдите ключ с максимальным значением.
//    Переберите TreeMap и найдите ключ с минимальным значением.
//    Переберите HashMap и удалите все элементы с четными значениями.
//    Переберите TreeMap и удалите все элементы с ключами, начинающимися с буквы 'A'.
//    Переберите TreeMap и найдите наибольший ключ, который меньше или равен заданному ключу.
//    Переберите HashMap и найдите ключ с максимальной суммой значений в его вложенных HashMap: HashMap<String, HashMap<String, Integer>> nestedHashMap = new HashMap<>();

    // TODO: 18.09.2023  //    Переберите все ключи и значения в HashMap и TreeMap и выведите их на экран.
    void goThroughTheKeys(HashMap<Integer, String> mapa) {
        for (Map.Entry<Integer, String> m : mapa.entrySet()) {
            System.out.println(m);
        }
    }

    // TODO: 18.09.2023  //    Переберите только ключи в HashMap и TreeMap и найдите сумму их длин.
    Integer sumOfLengths(HashMap<String, String> mapa) {
        Integer sum = 0;
        for (String m : mapa.keySet()) {
            sum += m.length();
        }
        return sum;
    }
// TODO: 18.09.2023  //    Переберите только значения в HashMap и TreeMap и найдите их среднее значение.

}

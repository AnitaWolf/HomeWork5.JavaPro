import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /**
     * Task 1. Given a string s, find the first
     * non-repeating character in it and return
     * its index. If it does not exist, return -1.
     * <p>
     * Задание 1. Дана строка s, найдите в ней
     * первый неповторяющийся символ и верните его индекс.
     * Если он не существует, верните значение -1.
     * <p>
     * Example 1:
     * Input: s = "leetcode"
     * Output: 0
     * Example 2:
     * Input: s = "loveleetcode"
     * Output: 2
     * Example 3:
     * Input: s = "aabb"
     * Output: -1
     * Подсказка: можно решить, используя HashMap.
     */
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(searchOfFirstUniqCharacter(s));

    }


    public static int searchOfFirstUniqCharacter(String str) {
        Map<Character, Integer> mapChar = new HashMap<>();// создаем hashmap для символов и их количества
        for (int i = 0; i < str.length(); i++) {// проходимся по всем символам строки
            char ch = str.charAt(i);//каждый символ записываем в переменную
            if (mapChar.containsKey(ch)) {// если символ уже встречался
                mapChar.put(ch, mapChar.get(ch) + 1);// увеличиваем его количество на 1
            } else {
                mapChar.put(ch, 1);// иначе добавляем его в hashmap с количеством 1
            }
        }
        for (int i = 0; i < mapChar.size(); i++) {// проходимся по всем символам в  map
            char ch = str.charAt(i);
            if (mapChar.get(ch) == 1) { //если символ встретился только один раз
                return i;               // возвращаем его индекс
            }
        }
        return -1;               // если такого символа нет, возвращаем -1
    }
}

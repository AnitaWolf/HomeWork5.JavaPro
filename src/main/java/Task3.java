import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task3 {

    /**
     * Task 3. Дана строка. Вывести количество
     * появлений каждого символа в этой строке. Например:
     * Lorem ipsum dolor sit amet, consectetur adipiscing elit.
     * Integer eu feugiat tellus. Nam molestie diam sed libero
     * egestas pellentesque. Nulla.
     * <p>
     * Символ e встречается 20 раз.
     * Символ пробел/space встречается 19 раз.
     * Символ l встречается 11 раз.
     * Символ i встречается 11 раз.
     * Символ t встречается 11 раз.
     * Символ s встречается 10 раз.
     * Символ u встречается 7 раз.
     * Символ a встречается 7 раз.
     * Символ n встречается 6 раз.
     * Символ m встречается 6 раз.
     * Символ o встречается 6 раз.
     * Символ r встречается 5 раз.
     * Символ . встречается 4 раз.
     * Символ g встречается 4 раз.
     * Символ d встречается 4 раз.
     * Символ c встречается 3 раз.
     * Символ p встречается 3 раз.
     * Символ , встречается 1 раз.
     * Символ f встречается 1 раз.
     * Символ b встречается 1 раз.
     * Символ q встречается 1 раз.
     */


    public static void main(String[] args) {
        String s ="Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. " +
                "Integer eu feugiat tellus. " +
                "Nam molestie diam sed libero " +
                "egestas pellentesque. Nulla.";
        searchQuantityOfCharacter(s);
    }

    private static void searchQuantityOfCharacter (String str) {

        Map<Character, Integer> MapOfChar = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (MapOfChar.containsKey(ch)) {
                MapOfChar.put(ch, MapOfChar.get(ch) + 1);
            } else {
                MapOfChar.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : MapOfChar.entrySet()) {
            System.out.println(" символ "+entry.getKey() + " встречается " + entry.getValue()+" раз");
        }
    }

}
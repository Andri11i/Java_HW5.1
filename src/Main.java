import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static int countOccurrence(List<String> list, String word) {
        int count = 0;
        for (String s : list) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        return list;
    }


    public static List<Integer> findUnique(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }


    public static void calcOccurrence(List<String> list) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : list) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }
        occurrences.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    public static List<Map<String, Object>> findOccurrence(List<String> list) {
        Map<String, Integer> occurrences = new HashMap<>();
        for (String word : list) {
            occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
        }

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", entry.getKey());
            map.put("occurrence", entry.getValue());
            result.add(map);
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("bird", "cat", "dog", "bird", "cat", "dog", "bird", "fox");
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3};
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);


        System.out.println("Occurrences of 'bird': " + countOccurrence(words, "bird"));

        System.out.println("Array to List: " + toList(array));

        System.out.println("Unique numbers: " + findUnique(numbers));


        System.out.println("Word occurrences:");
        calcOccurrence(words);


        System.out.println("Find occurrences:");
        List<Map<String, Object>> occurrences = findOccurrence(words);
        System.out.println(occurrences);
    }
}

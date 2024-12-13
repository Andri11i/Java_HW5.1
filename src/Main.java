import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static int countOccurrence(List<String> words, String word) {
        int count = 0;
        for (String s : words) {
            if (s.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> numbersList = new ArrayList<>();
        for (int value : numbers){
            numbersList.add(value);
        }
        return  numbersList;
    }


    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniques = new ArrayList<>();
        for (Integer num : list) {
            if (!uniques.contains(num)) {
                uniques.add(num);
            }
        }
        return uniques;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> processedWords = new ArrayList<>();
        for (String word : words) {
            if (!processedWords.contains(word)) {
                processedWords.add(word);
                int count = 0;
                for (String currentWord : words) {
                    if (currentWord.equals(word)) {
                        count++;
                    }
                }
                System.out.println(word + ": " + count);
            }
        }
    }

    public static List<List<Object>> findOccurrence(List<String> words) {
        List<String> processedWords = new ArrayList<>();
        List<List<Object>> result = new ArrayList<>();
        for (String word : words) {
            if (!processedWords.contains(word)) {
                processedWords.add(word);
                int count = 0;
                for (String currentWord : words) {
                    if (currentWord.equals(word)) {
                        count++;
                    }
                }
                List<Object> wordCount = new ArrayList<>();
                wordCount.add(word);
                wordCount.add(count);
                result.add(wordCount);
            }
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
        List<List<Object>> occurrences = findOccurrence(words);
        System.out.println(occurrences);
    }
}

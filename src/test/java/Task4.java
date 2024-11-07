import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dog", "cat", "elephant", "tiger", "lion", "ant");

        List<String> filteredWords = words.stream()
                                     .filter(length -> length.length() < 4)
                                     .map(String::toUpperCase) //(item -> item.toUpperCase())
                                     .sorted()
                                     .toList();

        filteredWords.forEach(System.out::println); //(item -> System.out.println(item))
    }
}

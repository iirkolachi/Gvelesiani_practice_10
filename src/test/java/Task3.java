import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

        List<String> sortedNames = names.stream()
                                   .sorted()
                                   .toList();

        int i = 0;
        while (i < names.size()) {
            System.out.println(sortedNames.get(i));
            i++;
        }
    }
}

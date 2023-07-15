import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindStringWhichHasMaxLengthExample {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Java", "JavaScript","React", "Vue", "Angular", "Spring Boot");

        Optional<String> max = lists.stream().max(Comparator.comparing(String::length));
        System.out.println(max.orElse(""));

        String s = lists.stream().collect(Collectors.maxBy(Comparator.comparing(String::length))).get();
        System.out.println(s);

        Optional<String> min = lists.stream().min(Comparator.comparing(String::length));
        System.out.println(min.orElse(""));

        String minString = lists.stream().collect(Collectors.minBy(Comparator.comparing(String::length))).get();
        System.out.println(minString);


    }
}

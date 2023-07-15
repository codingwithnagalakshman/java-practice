import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FindMaxLengthStringExample {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Java", "JavaScript","React", "Vue", "Angular", "Spring Boot");

        OptionalInt max = lists.stream().mapToInt(String::length).max();

        System.out.println(max.orElse(0));

        int max1 = lists.stream().collect(Collectors.summarizingInt(String::length)).getMax();
        System.out.println(max1);

        int min = lists.stream().collect(Collectors.summarizingInt(String::length)).getMin();
        System.out.println(min);

        OptionalInt min1 = lists.stream().mapToInt(String::length).min();
        System.out.println(min1.orElse(0));
    }
}

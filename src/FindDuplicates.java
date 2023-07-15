import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3,4 ,1, 4, 2, 4, 6, 7, 8, 3, 5, 2, 1, 9);

        Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List<Integer> integerList = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(integerList);

        Set<Integer> collect1 = integers.stream().filter(i -> Collections.frequency(integers, i) > 1).collect(Collectors.toSet());
        System.out.println(collect1);

        Set<Integer> items = new HashSet<>();

        Set<Integer> collect2 = integers.stream().filter(i -> !items.add(i)).collect(Collectors.toSet());
        System.out.println(collect2);

    }
}

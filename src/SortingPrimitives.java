import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingPrimitives {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 2, 4,9, 6, 3, 8, 7);

        List<Integer> integers = integerList.stream().sorted().collect(Collectors.toList());

        System.out.println(integers);

        List<Integer> integersReversed = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(integersReversed);
    }

}

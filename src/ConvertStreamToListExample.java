import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStreamToListExample {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("Java", "JavaScript", "React", "Vue", "Angular", "Spring boot");
        List<String> stringList = stringStream.collect(Collectors.toList());
        System.out.println(stringList);

        List<Integer> integers = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
        System.out.println(integers);
    }
}

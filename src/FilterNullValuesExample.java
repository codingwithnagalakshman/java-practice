import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterNullValuesExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", null, "React", "Vue");
        System.out.println(list);
        List<String> stringList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(stringList);
    }
}

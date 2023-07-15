import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStreamExample {
    public static void main(String[] args) {
        String[] array = {"Java", "JavaScript", "React", "Angular", "Vue", "Spring boot"};
//        Stream<String> stream = Arrays.stream(array);
//        long count = stream.count();
//        System.out.println(count);

        Stream<String> array1 = Stream.of(array);
        long count = array1.count();
        System.out.println(count);

    }
}

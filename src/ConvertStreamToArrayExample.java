import java.util.stream.Stream;

public class ConvertStreamToArrayExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Java", "JavaScript", "React", "Spring boot", "Angular", "Vue");

        String[] array = stringStream.map(String::toUpperCase).toArray(String[]::new);
        for(String s: array) {
            System.out.println(s);
        }

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        int[] array1 = integerStream.mapToInt(Integer::intValue).toArray();
        for (Integer i: array1){
            System.out.println(i);
        }
    }
}

import java.util.Arrays;
import java.util.List;

public class ForEachLoopExample {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2,3, 4,5, 6, 8, 9, 10);

        integers.stream().parallel()
                .forEach( System.out:: print);

        integers.stream().parallel()
                .forEachOrdered(System.out:: print);
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDistinctExample {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2022, 25000.00);
        Car car2 = new Car("Honda", "Civic", 2021, 22000.00);
        Car car3 = new Car("Ford", "Mustang", 2023, 40000.00);
        Car car4 = new Car("Chevrolet", "Cruze", 2020, 18000.00);
        Car car5 = new Car("BMW", "X5", 2022, 60000.00);
        Car car6 = new Car("Mercedes-Benz", "C-Class", 2023, 55000.00);
        Car car7 = new Car("Audi", "A4", 2021, 45000.00);
        Car car8 = new Car("Nissan", "Altima", 2020, 20000.00);
        Car car9 = new Car("Hyundai", "Elantra", 2022, 23000.00);
        Car car10 = new Car("Kia", "Sportage", 2023, 27000.00);

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

//        List<Integer> integers = cars.stream().map(Car::getYear).collect(Collectors.toList());

        List<Integer> integers = cars.stream().map(Car::getYear).distinct().collect(Collectors.toList());

        Set<Integer> collect = cars.stream().map(Car::getYear).collect(Collectors.toSet());

        System.out.println(collect);

        List<String> strings = Arrays.asList("Java", "JavaScript", "Java", "React");

        List<String> stringList = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(stringList);

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ListToMapExample {
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
//        Car car11 = new Car("Ford", "EcoSport", 2023, 65000.00);

         List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10);

//        Map<String, Double> map = cars.stream()
//                .collect(Collectors.toMap(Car::getMake, Car::getPrice));
//        System.out.println(map);
//
//        Map<String, Double> map1 = cars.stream()
//                .collect(Collectors.toMap(Car::getMake, Car::getPrice, (oldPrice, newPrice) -> oldPrice));
//        System.out.println(map1);
//
//        Map<String, Double> map2 = cars.stream()
//                .collect(Collectors.toMap(Car::getMake, Car::getPrice, (oldPrice, newPrice) -> oldPrice, TreeMap::new));
//        System.out.println(map2);
//        System.out.println(map.getClass());

        Map<String, Car> map3 = cars.stream().collect(Collectors.toMap(car -> car.getMake(), car -> car));
        System.out.println(map3);


    }
}

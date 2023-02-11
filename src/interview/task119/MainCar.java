package interview.task119;



import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MainCar {
    public static void main(String[] args) {
        Cars car1 = new Cars(LocalDate.of(2010,11,1));
        Cars car2 = new Cars(LocalDate.of(2010,7,1));
        Cars car3 = new Cars(LocalDate.of(2010,6,12));
        Cars car4 = new Cars(LocalDate.of(2010,1,13));
        Cars car5 = new Cars(LocalDate.of(2010,2,14));
        Cars car6 = new Cars(LocalDate.of(2010,5,15));

        List<Cars> carList = List.of(car1,car2,car3,car4,car5,car6);
//1
        LinkedList<Cars> cars = carList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println("cars.getLast() = " + cars.getLast().getCreate());

//2
        List<Cars> carListL = new ArrayList<>();
        Optional<Cars> optCars =
        carListL.stream().max(Comparator.comparing(Cars::getCreate));

        optCars.ifPresent(System.out::println);
//        System.out.println("carListL.toString() = " + carListL.get(3).toString()); -->
//        -->  Exception in thread "main" java.lang.IndexOutOfBoundsException
    }
}

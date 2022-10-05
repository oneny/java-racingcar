package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Cars implements Iterable<Car> {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars move() {
        Cars cars = new Cars(new ArrayList(this.cars));
        for (Car car : cars.cars) {
            car.move(Moving.create());
        }
        return cars;
    }

    public Cars longest() {
        Car max = Collections.max(cars);
        List<Car> longest = new ArrayList<>();
        for (Car car : cars) {
            addEqualsDistance(max, longest, car);
        }
        return new Cars(longest);
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        for (Car car : cars) {
            names.add(car.name());
        }
        return names;
    }

    public static Cars from(CarNames names) {
        List<Car> cars = new ArrayList<>();
        for (String carName : names) {
            cars.add(new Car(carName));
        }
        return new Cars(cars);
    }
    
    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Cars other = (Cars) o;
        return cars.containsAll(other.cars) && other.cars.containsAll(cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    private void addEqualsDistance(Car max, List<Car> longest, Car car) {
        if (max.distance() == car.distance()) {
            longest.add(car);
        }
    }
}
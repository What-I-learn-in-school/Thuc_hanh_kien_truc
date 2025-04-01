package testPattern;

import testPattern.car.Car;
import testPattern.carFactory.CarFactory;
import testPattern.carFactory.MordernCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new MordernCarFactory();

        Car car = new Car(carFactory);

        car.call();

    }
}

package testPattern.car;

import testPattern.carFactory.CarFactory;
import testPattern.glass.Glass;
import testPattern.seat.Seat;

public class Car {
    private Glass glass;
    private Seat seat;

    public Car(CarFactory carFactory){
        glass = carFactory.createGlsas();
        seat = carFactory.createSeat();
    }

    public void call () {
        glass.glassOption();
        seat.sit();
    }
}

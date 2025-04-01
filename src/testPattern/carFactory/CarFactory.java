package testPattern.carFactory;

import testPattern.glass.Glass;
import testPattern.seat.Seat;

public interface CarFactory {
    Glass createGlsas();
    Seat createSeat();

}

package testPattern.carFactory;

import testPattern.glass.Glass;
import testPattern.glass.MoreGlass;
import testPattern.seat.MoreSeat;
import testPattern.seat.Seat;

public class MoreCarFactory implements CarFactory{
    @Override
    public Glass createGlsas() {
        return new MoreGlass();
    }

    @Override
    public Seat createSeat() {
        return new MoreSeat();
    }
}

package testPattern.carFactory;

import testPattern.glass.Glass;
import testPattern.glass.MordernGlass;
import testPattern.seat.ModernSeat;
import testPattern.seat.Seat;

public class MordernCarFactory implements CarFactory {


    @Override
    public Glass createGlsas() {
        return new MordernGlass();
    }

    @Override
    public Seat createSeat() {
        return new ModernSeat();
    }
}

package strategyPartern.strategy.implement;

import strategyPartern.strategy.NhiemVuStrategy;

;

public class GiamDocStrategy implements NhiemVuStrategy {

    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của giám đốc");
    }
}
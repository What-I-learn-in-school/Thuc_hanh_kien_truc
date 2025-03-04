package strategyPartern.strategy.implement;

import strategyPartern.strategy.NhiemVuStrategy;

public class PhoGiamDocStrategy implements NhiemVuStrategy {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của Phó Giám Đốc: Phụ trách khi giám đốc đi vắng");
    }
}
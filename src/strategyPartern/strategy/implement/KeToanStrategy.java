package strategyPartern.strategy.implement;

import strategyPartern.strategy.NhiemVuStrategy;

public class KeToanStrategy implements NhiemVuStrategy {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của (Kế toán: Tính toán tiền cho Công Ty, nộp tiền vào TK");
    }
}
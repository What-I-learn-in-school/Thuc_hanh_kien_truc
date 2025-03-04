package strategyPartern.strategy.implement;

import strategyPartern.strategy.NhiemVuStrategy;

public class NhanVienStrategy implements NhiemVuStrategy {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của Nhân Viên: Pha trà, giữ xe ");
    }
}
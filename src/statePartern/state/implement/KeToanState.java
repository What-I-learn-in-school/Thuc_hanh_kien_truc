package statePartern.state.implement;

import statePartern.state.NhiemVuState;

public class KeToanState implements NhiemVuState {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của kế toán");
    }
}
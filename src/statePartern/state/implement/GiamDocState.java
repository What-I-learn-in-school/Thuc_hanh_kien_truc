package statePartern.state.implement;

import statePartern.state.NhiemVuState;

public class GiamDocState implements NhiemVuState {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của giám đốc");
    }
}
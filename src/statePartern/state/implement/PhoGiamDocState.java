package statePartern.state.implement;


import statePartern.state.NhiemVuState;

public class PhoGiamDocState implements NhiemVuState {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của phó giám đốc");
    }
}
package statePartern.state.implement;


import statePartern.state.NhiemVuState;

public class PhoGiamDocState implements NhiemVuState {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của Phó Giám Đốc: Phụ trách khi giám đốc đi vắng");
    }
}
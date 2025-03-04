package statePartern.state.implement;


import statePartern.state.NhiemVuState;

public class NhanVienState implements NhiemVuState {
    @Override
    public void getNhiemVu() {
        System.out.println("Nhiệm vụ của Nhân Viên: Pha trà, giữ xe ");
    }
}
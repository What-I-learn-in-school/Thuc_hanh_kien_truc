package statePartern.model;

import statePartern.state.NhiemVuState;

public class Employee {

    private int id;
    private String name;
    private NhiemVuState nhiemVuState;

    public void setNhiemVuState(NhiemVuState nhiemVuState) {
        this.nhiemVuState = nhiemVuState;
    }

    public void getNhiemVuStatePartern() {
        if (nhiemVuState != null) {
            nhiemVuState.getNhiemVu();
        } else {
            System.out.println("Không có nhiệm vụ");
        }
    }
}

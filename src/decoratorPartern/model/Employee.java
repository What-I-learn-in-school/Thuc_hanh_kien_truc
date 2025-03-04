package decoratorPartern.model;

import decoratorPartern.state.NhiemVu;
import statePartern.state.NhiemVuState;

public class Employee implements NhiemVu {

    private int id;
    private String name;
    private NhiemVuState nhiemVuState;

    public void setNhiemVuState(NhiemVuState nhiemVuState) {
        this.nhiemVuState = nhiemVuState;
    }

    @Override
    public void getNhiemVu() {
    }
}

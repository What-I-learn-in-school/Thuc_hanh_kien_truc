package statePartern;

import statePartern.state.implement.GiamDocState;
import statePartern.state.implement.KeToanState;
import statePartern.state.implement.NhanVienState;
import statePartern.state.implement.PhoGiamDocState;
import statePartern.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNhiemVuState(new GiamDocState());
        employee.getNhiemVuStatePartern();

        employee.setNhiemVuState(new PhoGiamDocState());
        employee.getNhiemVuStatePartern();

        employee.setNhiemVuState(new KeToanState());
        employee.getNhiemVuStatePartern();

        employee.setNhiemVuState(new NhanVienState());
        employee.getNhiemVuStatePartern();
    }
}
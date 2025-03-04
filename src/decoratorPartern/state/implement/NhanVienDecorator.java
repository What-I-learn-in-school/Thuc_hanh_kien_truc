package decoratorPartern.state.implement;


import decoratorPartern.state.EmployeeDecorator;
import decoratorPartern.state.NhiemVu;

public class NhanVienDecorator extends EmployeeDecorator {
    public NhanVienDecorator(NhiemVu decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void getNhiemVu() {
        decoratedEmployee.getNhiemVu();
        setNhanVienNhiemVu(decoratedEmployee);
    }

    private void setNhanVienNhiemVu(NhiemVu decoratedEmployee) {
        System.out.println("Nhiệm vụ của nhân viên");
    }
}
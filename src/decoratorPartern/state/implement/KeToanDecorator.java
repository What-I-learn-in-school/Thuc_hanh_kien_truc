package decoratorPartern.state.implement;

import decoratorPartern.state.EmployeeDecorator;
import decoratorPartern.state.NhiemVu;


public class KeToanDecorator extends EmployeeDecorator {
    public KeToanDecorator(NhiemVu decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void getNhiemVu() {
        decoratedEmployee.getNhiemVu();
        setKeToanNhiemVu(decoratedEmployee);
    }

    private void setKeToanNhiemVu(NhiemVu decoratedEmployee) {
        System.out.println("Nhiệm vụ của (Kế toán: Tính toán tiền cho Công Ty, nộp tiền vào TK");
    }
}
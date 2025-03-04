package decoratorPartern.state.implement;

import decoratorPartern.state.EmployeeDecorator;
import decoratorPartern.state.NhiemVu;


public class PhoGiamDocDecorator extends EmployeeDecorator {
    public PhoGiamDocDecorator(NhiemVu decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void getNhiemVu() {
        decoratedEmployee.getNhiemVu();
        setPhoGiamDocNhiemVu(decoratedEmployee);
    }

    private void setPhoGiamDocNhiemVu(NhiemVu decoratedEmployee) {
        System.out.println("Nhiệm vụ của phó giám đốc");
    }
}
package decoratorPartern.state.implement;


import decoratorPartern.state.EmployeeDecorator;
import decoratorPartern.state.NhiemVu;

public class GiamDocDecorator extends EmployeeDecorator {
    public GiamDocDecorator(NhiemVu decoratedEmployee) {
        super(decoratedEmployee);
    }

    @Override
    public void getNhiemVu() {
        decoratedEmployee.getNhiemVu();
        setGiamDocNhiemVu(decoratedEmployee);
    }

    private void setGiamDocNhiemVu(NhiemVu decoratedEmployee) {
        System.out.println("Nhiệm vụ của giám đốc");
    }
}
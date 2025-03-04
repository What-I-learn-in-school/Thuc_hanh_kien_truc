package decoratorPartern.state;

public abstract class EmployeeDecorator implements NhiemVu {
    protected NhiemVu decoratedEmployee;

    public EmployeeDecorator(NhiemVu decoratedEmployee) {
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public void getNhiemVu() {
        decoratedEmployee.getNhiemVu();
    }
}

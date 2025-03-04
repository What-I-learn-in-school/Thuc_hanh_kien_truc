package noDesignPartern;

import noDesignPartern.model.ChucVu;
import noDesignPartern.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Phung Anh Minh", ChucVu.GIAMDOC);

        employee.getNhiemVu();

        employee.setNhiemVuState(ChucVu.PHOGIAMDOC);
        employee.getNhiemVu();
    }
}
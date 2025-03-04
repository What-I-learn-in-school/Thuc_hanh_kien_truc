package strategyPartern;

import strategyPartern.model.Employee;
import strategyPartern.strategy.implement.GiamDocStrategy;
import strategyPartern.strategy.implement.KeToanStrategy;
import strategyPartern.strategy.implement.NhanVienStrategy;
import strategyPartern.strategy.implement.PhoGiamDocStrategy;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setNhiemVuStrategy(new GiamDocStrategy());
        employee.getNhiemVu();

        employee.setNhiemVuStrategy(new PhoGiamDocStrategy());
        employee.getNhiemVu();

        employee.setNhiemVuStrategy(new KeToanStrategy());
        employee.getNhiemVu();

        employee.setNhiemVuStrategy(new NhanVienStrategy());
        employee.getNhiemVu();
    }
}
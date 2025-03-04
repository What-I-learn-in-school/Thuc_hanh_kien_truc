package decoratorPartern;

import decoratorPartern.model.Employee;
import decoratorPartern.state.NhiemVu;
import decoratorPartern.state.implement.GiamDocDecorator;
import decoratorPartern.state.implement.KeToanDecorator;
import decoratorPartern.state.implement.NhanVienDecorator;
import decoratorPartern.state.implement.PhoGiamDocDecorator;

public class Main {
    public static void main(String[] args) {
        NhiemVu employee = new Employee();

        NhiemVu giamDoc = new GiamDocDecorator(employee);
        giamDoc.getNhiemVu();

        NhiemVu phoGiamDoc = new PhoGiamDocDecorator(employee);
        phoGiamDoc.getNhiemVu();

        NhiemVu keToan = new KeToanDecorator(employee);
        keToan.getNhiemVu();

        NhiemVu nhanVien = new NhanVienDecorator(employee);
        nhanVien.getNhiemVu();
    }
}

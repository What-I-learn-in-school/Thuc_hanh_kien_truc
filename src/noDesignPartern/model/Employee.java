package noDesignPartern.model;

public class Employee {

    private int id;
    private String name;
    private ChucVu chucVu;

    public Employee(int id, String name, ChucVu chucVu) {
        this.id = id;
        this.name = name;
        this.chucVu = chucVu;
    }

    public void setNhiemVuState(ChucVu nhiemVuState) {
        this.chucVu = nhiemVuState;
    }

    public void getNhiemVu() {
        switch (chucVu) {
            case KETOAN:
                System.out.println("Nhiệm vụ của kế toán");
                break;
            case NHANVIEN:
                System.out.println("Nhiệm vụ của nhân viên");
                break;
            case GIAMDOC:
                System.out.println("Nhiệm vụ của giám đốc");
                break;
            case PHOGIAMDOC:
                System.out.println("Nhiệm vụ của phó giám đốc");
                break;
            default:
                System.out.println("Không có nhiệm vụ");
        }
    }
}

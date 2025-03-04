package strategyPartern.model;

import strategyPartern.strategy.NhiemVuStrategy;

public class Employee {

    private int id;
    private String name;
    private NhiemVuStrategy nhiemVuStrategy;

    public void setNhiemVuStrategy(NhiemVuStrategy nhiemVuStrategy) {
        this.nhiemVuStrategy = nhiemVuStrategy;
    }

    public void getNhiemVu() {
        if (nhiemVuStrategy != null) {
            nhiemVuStrategy.getNhiemVu();
        } else {
            System.out.println("Không có nhiệm vụ");
        }
    }
}

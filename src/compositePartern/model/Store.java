package compositePartern.model;

import compositePartern.Component;

import java.util.ArrayList;
import java.util.List;

public class Store{
    private String name;
    private List<Table> tables = new ArrayList<>();

    public void addTable(Table item){
        tables.add(item);
    }

    public double getTotalPrice() {
        double price = 0;
        for (Table table : tables){
            price += table.getPrice();
        }
        return price;
    }
}

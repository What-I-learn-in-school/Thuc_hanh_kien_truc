package compositePartern.model;

import compositePartern.Component;

import java.util.ArrayList;
import java.util.List;

public class Table implements Component {
    private List<Component> items = new ArrayList<>();

    public void addItem(Component item) {
        items.add(item);
    }

    @Override
    public double getPrice(){
        double total = 0;
        for (Component item : items){
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Table total: " + getPrice() + " VND";
    }
}

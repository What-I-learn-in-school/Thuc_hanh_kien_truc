package compositePartern;

import compositePartern.model.Product;
import compositePartern.model.Store;
import compositePartern.model.Table;

public class Main {
    public static void main(String[] args) {
//        Products
        Product product1 = new Product("Cà phê trứng", 40000);
        Product product2 = new Product("Cà phê sữa", 30000);
        Product product3 = new Product("Cà phê đen", 25000);

//        Table
        Table table1 = new Table();
        table1.addItem(product1);
        table1.addItem(product1);
        table1.addItem(product2);

        Table table2 = new Table();
        table2.addItem(product1);
        table2.addItem(product1);
        table2.addItem(product2);

        System.out.println(table2.getPrice());

//        Store

        Store store = new Store();
        store.addTable(table1);
        store.addTable(table2);

        System.out.println(store.getTotalPrice());

    }
}

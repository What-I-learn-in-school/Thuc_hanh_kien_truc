package observerPartern;

import observerPartern.model.Investor;
import observerPartern.model.Stock;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("VN30", 100000);
        Investor investor1 = new Investor("Minh");
        Investor investor2 = new Investor("Hà");

        stock.attach(investor1);
        stock.attach(investor2);

        stock.setPrice(105000);
        System.out.println("-------------------------");
        stock.setPrice(98000);

        System.out.println("-------------------------");
    }
}

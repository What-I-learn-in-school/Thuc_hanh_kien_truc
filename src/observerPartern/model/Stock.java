package observerPartern.model;

import observerPartern.Observer;
import observerPartern.Subject;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private String symbol;
    private double price;
    private List<Observer> investors = new ArrayList<>();

    public Stock( String symbol, double price) {
        this.price = price;
        this.symbol = symbol;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers("Cổ phiếu " + symbol + " có giá mới: " + price + " VND");
    }

    @Override
    public void attach(Observer observer) {
        investors.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        investors.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer investor : investors) {
            investor.update(message);
        }
    }
}

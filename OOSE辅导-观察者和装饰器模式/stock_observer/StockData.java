import java.util.*;
public class StockData implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;
    private String stockName;

    public StockData(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(Observer o:observers){
            o.update(stockPrice,stockName);
        }
    }

    public void setStockPrice(double price){
        this.stockPrice = price;
        System.out.println("股票价格更新为: "+price);
        notifyObserver();
    }
}

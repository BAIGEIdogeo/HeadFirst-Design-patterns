public class Main {
    public static void main(String[] args){
        StockData stock = new StockData("AAPL",197.6);
        StockDisplay stock1 = new StockDisplay("同花顺");
        StockDisplay stock2 = new StockDisplay("东方财富");
        StockDisplay stock3 = new StockDisplay("英为财情");
        stock.registerObserver(stock1);
        stock.registerObserver(stock2);
        stock.registerObserver(stock3);
        stock.setStockPrice(199.2);
        stock.removeObserver(stock3);
        stock.setStockPrice(198.9);
    }
}

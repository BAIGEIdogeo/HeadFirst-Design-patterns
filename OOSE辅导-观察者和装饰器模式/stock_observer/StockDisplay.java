public class StockDisplay implements Observer{
    private String appName;

    public StockDisplay(String name){
        this.appName = name;
    }

    @Override
    public void update(double stockPrice,String stockName){
        System.out.println(this.appName +"显示"+stockName+ "股价变更为: "+ stockPrice);
    }
}

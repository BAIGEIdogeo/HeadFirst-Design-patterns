public class WeatherApp implements Observer{
    private String appName;

    public WeatherApp(String appName){
        this.appName = appName;
    }

    @Override
    public void update(String WeatherInfo){
        System.out.println(appName+"收到天气更新"+WeatherInfo);
    }
}

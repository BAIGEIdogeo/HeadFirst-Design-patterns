public class Main { 
    public static void main(String[] args) { 
    WeatherStation station = new WeatherStation(); 
    WeatherApp app1 = new WeatherApp("天气通"); 
    WeatherApp app2 = new WeatherApp("墨迹天气"); 
    WeatherApp app3 = new WeatherApp("小米天气"); 
    // 注册观察者
    station.addObserver(app1); 
    station.addObserver(app2); 
    station.addObserver(app3); 
    // 发布天气
    station.setWeatherInfo("晴天 ☀"); 
    station.setWeatherInfo("暴雨 ⚡"); 
    // 移除一个观察者
    station.removeObserver(app2); 
    station.setWeatherInfo("阴天 �"); 
    } 
   }
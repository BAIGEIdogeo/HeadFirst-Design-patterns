import java.util.*;
public class WeatherStation implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String WeatherInfo;

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer o:observers){
            o.update(WeatherInfo);
        }
    }

    public void setWeatherInfo(String info){
        this.WeatherInfo = info;
        notifyObservers();
    }
}

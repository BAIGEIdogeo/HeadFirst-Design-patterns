public class BasicCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "原味咖啡";
    }

    @Override
    public double getCost(){
        return 10.0;
    }
}//Concretecomponent-实现接口的具体类，可被装饰

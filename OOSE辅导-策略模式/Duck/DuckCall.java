public class DuckCall {
    FlyBehavior flyBehavior = new FlyNoWay();
    QuackBehavior quackBehavior = new Quack();

    public void display(){
        System.out.println("I'm a fake duck.");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
//如何实现鸭鸣器(DuckCall)而不继承Duck类？
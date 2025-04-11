public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();//输出quack
        mallard.performFly();//输出I'm flying

        Duck rocket = new ModelDuck();
        rocket.performFly();//新创建了rocket对象作为ModelDuck类的实例，调用performFly()会被委托给flyBehavior对象，是一个FlyNoWay实例，在ModelDuck构造器中设置。
        rocket.setFlyBehavior(new FlyRockedPowered());//调用setFlyBehavior()来自ModelDuck继承Duck,用new关键字创造新对象
        rocket.performFly();
    }
}

public abstract class Duck{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){}//抽象类不需要初始化状态
    
    public abstract void display();//抽象的方法，留给子类鸭子去决定具体的display实现

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");//所有鸭子都游泳，包括诱饵鸭
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }//这里两个setter体现了策略模式优势——运行时行为可变更
}
public class Squeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Squeak");
    }
}
//专供橡皮鸭的quack策略实现
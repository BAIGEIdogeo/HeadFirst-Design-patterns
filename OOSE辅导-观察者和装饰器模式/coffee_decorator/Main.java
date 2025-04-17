public class Main { 
    public static void main(String[] args) { 
    Coffee coffee = new BasicCoffee(); // 原味
    coffee = new MilkDecorator(coffee); // 加牛奶
    coffee = new SugarDecorator(coffee); // 加糖
    coffee = new SugarDecorator(coffee); // 再加糖一次！
    System.out.println("描述：" + coffee.getDescription()); 
    System.out.println("总价：" + coffee.getCost() + " 元"); 
    } 
   } 
interface Sandwich {
    String getDescription();
    double getCost();
}

class BasicSandwich implements Sandwich{
    String getDescription(){
        return "基础三明治";
    }

    double getCost(){
        return 10.0;
    }
}

abstract class SandwichDecorator implements Sandwich{
    protected Sandwich decoratedSandwich;

    SandwichDecorator(Sandwich sandwich){
        this.decoratedSandwich = sandwich;
    }
    
    String getDescription(){
        return decoratedSandwich.getDescription();
    }
    
    double getCost(){
        return decoratedSandwich.getCost();
    }
}

class LettuceDecorator extends SandwichDecorator{
    LettuceDecorator(Sandwich s){
        super(s);
    }

    String getDescription(){
        return super.getDescription()+"+生菜";
    }

    double getCost(){
        return super.getCost()+2.0;
    }
}

class Main{
    public static void main(String[] args){
        Sandwich sandwich = new BasicSandwich();
        sandwich = new LettuceDecorator(sandwich);
        System.out.println(sandwich.getDescription());
        System.out.println(sandwich.getCost());
    }
}
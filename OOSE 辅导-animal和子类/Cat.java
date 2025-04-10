// TODO: Define the Cat class, which is also a subclass of Animal
public class Cat extends Animal {
    // Step 1: Create a constructor that takes name and age
    // Hint: call super(name, age)
    public Cat(String name,int age){
        super(name,age);
    }
    // Step 2: Override the speak() method
    // It should print: "<cat's name> says: Meow!"
    @Override
    public void speak(){
        System.out.println(getName()+ "says: Meow");
    }
}

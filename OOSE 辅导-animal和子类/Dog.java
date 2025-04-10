// TODO: Define the Dog class, which is a subclass of Animal
public class Dog extends Animal {
    // Step 1: Declare private field breed (String)
    private String breed;
    // Step 2: Create a constructor that takes name, age, and breed
    // Hint: use super(name, age) to call the parent constructor
    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed=breed;
    }
    // Step 3: Write public getter and setter for breed
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Step 4: Override the speak() method
    // It should print: "<dog's name> says: Woof!"
    @Override
    public void speak(){
        System.out.println(getName()+ "says: Woof");
    }
}

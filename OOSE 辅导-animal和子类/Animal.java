// TODO: Define the Animal class
public class Animal {
    // Step 1: Declare private fields for name (String) and age (int)
    private String name;
    private int age;
    // Step 2: Create a constructor that sets name and age
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    // Step 3: Write public getters and setters for both fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Step 4: Add a method called speak() that prints: "The animal makes a sound."
    public void speak(){
        System.out.println("The animal makes a sound.");
    }

}

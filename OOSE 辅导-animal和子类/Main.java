// TODO: Main program entry point
public class Main {
    public static void main(String[] args) {
        // Step 1: Create an Animal object
        // Example: Animal a = new Animal("Generic", 2);
        Animal generic = new Animal("Pets",4);
        generic.speak();
        // Step 2: Create a Dog object
        // Example: Dog d = new Dog("Buddy", 5, "Golden Retriever");
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        dog.speak();
        System.out.println("Breed:"+dog.getBreed());
        // Step 3: (Optional) Create a Cat object
        // Example: Cat c = new Cat("Whiskers", 3);
        Cat cat=new Cat("Kat",3);
        // Step 4: Call speak() method on each object
        // This shows polymorphism
        Animal pet1 = dog;
        Animal pet2 = cat;
        pet1.speak();
        pet2.speak();
        // Step 5: Print details using getters
        // Example: d.getName(), d.getBreed()
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genfhmal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Gedhl");
        System.out.println(mammal);

        Cat cat = new Cat("Wxsrs");
        System.out.println(cat);
        cat.greets(); // Expected: Meow

        Dog dog1 = new Dog("sg");
        System.out.println(dog1);
        dog1.greets(); // Expected: Woof

        Dog dog2 = new Dog("Bz");
        dog1.greets(dog2);
    }
}

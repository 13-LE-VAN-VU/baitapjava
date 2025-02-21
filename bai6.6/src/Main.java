public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty");
        cat.greets();

        Dog dog = new Dog("Buddy");
        dog.greets();

        Dog anotherDog = new Dog("Charlie");
        dog.greets(anotherDog);

        BigDog bigDog = new BigDog("Max");
        bigDog.greets();
        bigDog.greets(dog);

        BigDog anotherBigDog = new BigDog("Rocky");
        bigDog.greets(anotherBigDog);
    }
}

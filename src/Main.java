public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Шарик");

        cat.swim(50);
        dog.swim(5);
        cat.run(300);
        cat.run(150);
        dog.run(1000);
        dog.run(400);

        Cat secondCat = new Cat("Мурка");
        secondCat.run(30);

        System.out.println("Мы создали " + Animal.animalCount + " животных!");
    }
}

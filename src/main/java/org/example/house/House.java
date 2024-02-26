package org.example.house;

public class House {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", "white", 2);
        Cat cat2 = new Cat("Vasya", "black", 1);
        cat1.sayHello();
        cat2.sayHello();
        Robot robot1 = new Robot("Valuum cleaner", "Robot cleaner");
        Dog dog = new Dog("Jack", "grey", 1);
        dog.bark();
        dog.sayHello();
//        dog.feed();

        Animal animal = dog;
        animal.displayAnimalInfo();
        animal = cat1;
        animal.displayAnimalInfo();

//        Animal animal = new Animal("Jack", "grey", 1);

        Human human = new Human("Harry");
//        human.feedAnimal(dog);
        human.feedAnimal(dog, cat1, cat2);

        human.walk(dog);
        human.walk(cat1);

        human.play(dog);
        dog.play(robot1);

        dog.play(cat1);
        cat1.play(dog);

       Cat blackCat = new BlackCat("Black cat",2);
       blackCat.play(dog);
       dog.play(blackCat);
    }
}

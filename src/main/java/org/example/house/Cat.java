package org.example.house;

public class Cat extends Animal{
    public Cat(String catName){
        this(catName,"white",1);
    }

    public Cat(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {
        System.out.println("Meow! I'm cat. My name is "+super.getName());
    }
    public void meow(){
        System.out.println("Meow!");
    }
    @Override
    public void play(Creature another){
        if (another instanceof Dog){
            System.out.println("Cat " + getName() +" runs away from dog "+ another.getName());

        }else {
            super.play(another);
        }
    }
}

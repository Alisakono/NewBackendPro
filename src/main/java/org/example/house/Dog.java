package org.example.house;

public class Dog extends Animal{
    public Dog(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public void sayHello() {

    }
    public void bark(){
        System.out.println("Gav! Gav!");
    }
    @Override
    public void play(Creature another){
        if (another instanceof Cat){
            bark();
        }else {
            super.play(another);
        }
    }
}

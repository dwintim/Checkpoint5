package ru.javabegin.oop.checpointFive;

public class Car implements iCar{


    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println(name + " car drive ");
    }

    @Override
    public void stop() {
        System.out.println( name + " car stop ");
    }
}

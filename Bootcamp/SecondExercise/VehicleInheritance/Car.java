package Bootcamp.SecondExercise.VehicleInheritance;

public class Car implements Vehicle {


    @Override
    public void maxSpeed() {
        System.out.println(320);
    }


    @Override
    public void engine() {
        System.out.println("engine is on!");
    }

    @Override
    public void model() {
        System.out.println("Audi A7");
    }


    @Override
    public void gear(String motor, int wheels, int doors) {
        System.out.println("Motor: " + motor);
        System.out.println("Wheels: " + wheels);
        System.out.println("Doors: " + doors);
    }
}


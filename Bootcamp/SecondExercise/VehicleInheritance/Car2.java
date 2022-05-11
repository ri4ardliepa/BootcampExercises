package Bootcamp.SecondExercise.VehicleInheritance;

public class Car2 extends Car {

    @Override
    public void maxSpeed() {
        System.out.println(280);
    }

    @Override
    public void engine() {
        System.out.println("engine is on!");

    }

    @Override
    public void model() {
        System.out.println("BMW X6");
    }

}

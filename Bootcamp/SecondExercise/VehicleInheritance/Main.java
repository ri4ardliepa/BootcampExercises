package Bootcamp.SecondExercise.VehicleInheritance;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car();
        System.out.print("First car ");
        car.engine();
        System.out.print("The model of the first car is: ");
        car.model();
        car.gear("3.0 TFSI quattro", 4, 4);
        System.out.print("Maximum speed of the car is: ");
        car.maxSpeed();

        System.out.println();

        Vehicle car2 = new Car2();
        System.out.print("Second car ");
        car2.engine();
        System.out.print("The model of the second car is: ");
        car2.model();
        car2.gear("xDrive35i", 4, 2);
        System.out.print("Maximum speed of the car is: ");
        car2.maxSpeed();


    }
}

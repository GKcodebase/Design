package CreationalDesignPattern.Builder.components;

import CreationalDesignPattern.Builder.cars.Car;

/**
 * The type Trip computer.
 */
public class TripComputer {

    /**
     * The Car.
     */
    private Car car;

    /**
     * Sets car.
     *
     * @param car the car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    /**
     * Show fuel level.
     */
    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    /**
     * Show status.
     */
    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}

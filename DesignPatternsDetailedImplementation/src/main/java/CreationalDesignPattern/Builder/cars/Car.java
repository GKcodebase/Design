package CreationalDesignPattern.Builder.cars;

import CreationalDesignPattern.Builder.components.Engine;
import CreationalDesignPattern.Builder.components.GPSNavigator;
import CreationalDesignPattern.Builder.components.Transmission;
import CreationalDesignPattern.Builder.components.TripComputer;

/**
 * The type Car.
 */
public class Car {
    /**
     * The Car type.
     */
    private final CarType carType;
    /**
     * The Seats.
     */
    private final int seats;
    /**
     * The Engine.
     */
    private final Engine engine;
    /**
     * The Transmission.
     */
    private final Transmission transmission;
    /**
     * The Trip computer.
     */
    private final TripComputer tripComputer;
    /**
     * The Gps navigator.
     */
    private final GPSNavigator gpsNavigator;
    /**
     * The Fuel.
     */
    private double fuel = 0;

    /**
     * Instantiates a new Car.
     *
     * @param carType      the car type
     * @param seats        the seats
     * @param engine       the engine
     * @param transmission the transmission
     * @param tripComputer the trip computer
     * @param gpsNavigator the gps navigator
     */
    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * Gets car type.
     *
     * @return the car type
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * Gets fuel.
     *
     * @return the fuel
     */
    public double getFuel() {
        return fuel;
    }

    /**
     * Sets fuel.
     *
     * @param fuel the fuel
     */
    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    /**
     * Gets seats.
     *
     * @return the seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * Gets engine.
     *
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Gets transmission.
     *
     * @return the transmission
     */
    public Transmission getTransmission() {
        return transmission;
    }

    /**
     * Gets trip computer.
     *
     * @return the trip computer
     */
    public TripComputer getTripComputer() {
        return tripComputer;
    }

    /**
     * Gets gps navigator.
     *
     * @return the gps navigator
     */
    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}

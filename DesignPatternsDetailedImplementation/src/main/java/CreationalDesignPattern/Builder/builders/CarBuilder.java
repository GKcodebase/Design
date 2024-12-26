package CreationalDesignPattern.Builder.builders;

import CreationalDesignPattern.Builder.cars.Car;
import CreationalDesignPattern.Builder.cars.CarType;
import CreationalDesignPattern.Builder.components.Engine;
import CreationalDesignPattern.Builder.components.GPSNavigator;
import CreationalDesignPattern.Builder.components.Transmission;
import CreationalDesignPattern.Builder.components.TripComputer;

/**
 * The type Car builder.
 */
public class CarBuilder implements Builder {
    /**
     * The Type.
     */
    private CarType type;
    /**
     * The Seats.
     */
    private int seats;
    /**
     * The Engine.
     */
    private Engine engine;
    /**
     * The Transmission.
     */
    private Transmission transmission;
    /**
     * The Trip computer.
     */
    private TripComputer tripComputer;
    /**
     * The Gps navigator.
     */
    private GPSNavigator gpsNavigator;

    /**
     * Sets car type.
     *
     * @param type the type
     */
    public void setCarType(CarType type) {
        this.type = type;
    }

    /**
     * Sets seats.
     *
     * @param seats the seats
     */
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * Sets transmission.
     *
     * @param transmission the transmission
     */
    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    /**
     * Sets trip computer.
     *
     * @param tripComputer the trip computer
     */
    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    /**
     * Sets gps navigator.
     *
     * @param gpsNavigator the gps navigator
     */
    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
package CreationalDesignPattern.Builder.cars;

import CreationalDesignPattern.Builder.components.Engine;
import CreationalDesignPattern.Builder.components.GPSNavigator;
import CreationalDesignPattern.Builder.components.Transmission;
import CreationalDesignPattern.Builder.components.TripComputer;

/**
 * The type Manual.
 */
public class Manual {
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
     * Instantiates a new Manual.
     *
     * @param carType      the car type
     * @param seats        the seats
     * @param engine       the engine
     * @param transmission the transmission
     * @param tripComputer the trip computer
     * @param gpsNavigator the gps navigator
     */
    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    /**
     * Print string.
     *
     * @return the string
     */
    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
